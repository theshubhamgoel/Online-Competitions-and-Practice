import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

public class Test1 {

	protected Shell shell;
	static Voice voice;
	static VoiceManager vm;
	private Composite composite1, composite2;
	LiveSpeechRecognizer recognizer = null;
	private Text txt1, txt2;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Test1 window = new Test1();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		initializeVoice();
		initializeSpeech();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	private void initializeSpeech() {
		Configuration configuration = new Configuration();

		// Set path to acoustic model.
		configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		// Set path to dictionary.
		configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
		// Set language model.
		configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

		try {
			recognizer = new LiveSpeechRecognizer(configuration);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void initializeVoice() {
		System.setProperty("mbrola.base", "C:/Users/SHUBHAM/Desktop/jars/unzip/mbrola");
		vm = VoiceManager.getInstance();
		voice = vm.getVoice("mbrola_us2");
		voice.allocate();
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		int x = 500, y = 400;
		shell = new Shell();
		shell.setSize(x, y);
		shell.setText("MARK I");

		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(0, 0, x, y);

		// add data to first tab
		TabItem tbtmNewItem1 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem1.setText("Text To Speech");

		composite1 = new Composite(tabFolder, SWT.NONE);

		Label label1 = new Label(composite1, SWT.NONE);
		label1.setBounds(20, 28, 430, 32);
		label1.setText("Hello Sir, This is Text to speech converter");

		txt1 = new Text(composite1, SWT.BORDER | SWT.WRAP | SWT.MULTI);
		txt1.setBounds(20, 66, 430, 160);

		tbtmNewItem1.setControl(composite1);

		Button txt2SpeechBTN = new Button(composite1, SWT.NONE);
		txt2SpeechBTN.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String x = txt1.getText();
				System.out.println(x);
				voice.speak(x);
			}
		});
		txt2SpeechBTN.setBounds(20, 263, 75, 25);
		txt2SpeechBTN.setText("Speek Up");

		// add data to first tab
		TabItem tbtmNewItem2 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem2.setText("Speech to Text");

		composite2 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem2.setControl(composite2);

		Label label2 = new Label(composite2, SWT.NONE);
		label2.setBounds(20, 28, 430, 32);
		label2.setText("Hello Sir, This is Speech to Text converter");

		Button speech2txt = new Button(composite2, SWT.NONE);
		speech2txt.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				recognizer.startRecognition(true);
				System.out.println(">>>>Talk now...");
				SpeechResult result = recognizer.getResult();
				// Pause recognition process. It can be resumed then with
				// startRecognition(false).
				recognizer.stopRecognition();
				System.out.println("<<<<<Talking Done...");
				String x = result.getHypothesis();

				System.out.println(x);
				txt2.setText(x);

			}
		});

		speech2txt.setBounds(20, 72, 118, 25);
		speech2txt.setText("Start recognizeing");

		txt2 = new Text(composite2, SWT.BORDER | SWT.READ_ONLY | SWT.WRAP | SWT.MULTI);
		txt2.setText("hi");
		txt2.setBounds(20, 124, 430, 122);
	}
}
