/*
 * SEPT Assignment 1
 * 
 * Author: Stefan Fuchs
 * 		   John Kolovos
 * 
 */
package application;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import org.xml.sax.SAXException;

import xml.IAbstractParser;
import xml.SVGParser;
import factory.factory.SVGFactory;

public class SVGViewerApp extends JFrame {

	/* Variable section */
	private static final String APP_NAME = "SVGViewer";

	private SVGPanel svgPanel = null;
	private String fileName = null;
	private IAbstractParser parser = null;

	/**
	 * Constructor
	 * 
	 * @param fileName
	 *            Command-line argument passed to the program, or null if none
	 *            was specified.
	 */
	public SVGViewerApp(String fileName) {
		this.fileName = fileName;
		this.parser = new SVGParser(this.fileName, SVGFactory.instance());
		initUI();
		run();
	}

	/**
	 * Method to start the whole process
	 */
	private final void run() {

		try {

			this.svgPanel.setSvgContainer(parser.parse());

		} catch (SAXException e) {
			JOptionPane
					.showMessageDialog(null, "Could not parse \""
							+ this.fileName + "\".", "Error",
							JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			/* Case where file does not exist or cannot be opened */
			JOptionPane
					.showMessageDialog(null, "Could not open \""
							+ this.fileName + "\".", "Error",
							JOptionPane.ERROR_MESSAGE);
		} catch (NullPointerException e) {
			/* Case where no File has been provided */
			System.out.println("No commandline argument specified.");
		}

		setVisible(true);

	}

	/**
	 * Initialise the User Interface
	 */
	private final void initUI() {

		JMenuBar menuBar = new JMenuBar();

		/* File Menu begins here */

		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);

		/* Loading stuff */
		JMenuItem openMenuItem = new JMenuItem("Open");
		openMenuItem.setMnemonic(KeyEvent.VK_O);
		openMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFileChooser fc = new JFileChooser();
				fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

				fc.showOpenDialog(null);

				parser.setFile(fc.getSelectedFile().getAbsolutePath());

				try {
					svgPanel.setSvgContainer(parser.parse());
					svgPanel.repaint();
				} catch (SAXException e1) {
					JOptionPane.showMessageDialog(null, "Could not parse \""
							+ fc.getSelectedFile().getName() + "\".", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (IOException e1) {
					/* Case where file does not exist or cannot be opened */
					JOptionPane.showMessageDialog(null, "Could not open \""
							+ fc.getSelectedFile().getName() + "\".", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (NullPointerException e1) {
					/* Case where no File has been provided */
					System.out.println("No commandline argument specified.");
				}
			}
		});

		/* Exiting Stuff */
		JMenuItem exitMenuItem = new JMenuItem("Close");
		exitMenuItem.setMnemonic(KeyEvent.VK_C);
		exitMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		fileMenu.add(openMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		/* File Menu ends here */

		/* Help Menu begins here */
		JMenu helpMenu = new JMenu("Help");
		helpMenu.setMnemonic(KeyEvent.VK_H);

		/* The about dialog */
		JMenuItem aboutMenuItem = new JMenuItem("About " + APP_NAME);
		aboutMenuItem.setMnemonic(KeyEvent.VK_A);
		aboutMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								""
										+ "RMIT University - COSC2428 Software Eng: Process & Tools  COSC2428 \n\n"
										+ "CREDITS:\n" + "Group Name:  JARS\n"
										+ "AMRUTA VARSHINI (S3272373)\n"
										+ "DUDEJA, Rohit (S3240286)\n"
										+ "FUCHS, Stefan (S3260968)\n"
										+ "KOLOVOS, John (S3289732)\n",
								"RMIT University ",
								JOptionPane.INFORMATION_MESSAGE);
			}
		});

		helpMenu.addSeparator();
		helpMenu.add(aboutMenuItem);

		/* Help Menu ends here */

		menuBar.add(fileMenu);
		menuBar.add(helpMenu);

		setJMenuBar(menuBar);

		/* set up stuff to paint on */
		svgPanel = new SVGPanel();

		/* Border of the viewport of the svg image */
		svgPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		svgPanel.setLayout(null);
		add(svgPanel);

		setTitle(APP_NAME);
		setSize(800, 600);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String fileName = null;

		/*
		 * If there is one or more arguments passed, take the first one as the
		 * passed image
		 */
		if (args.length >= 1) {
			fileName = args[0];
		}

		/* Start the whole thing :-) */
		new SVGViewerApp(fileName);

	}
}
