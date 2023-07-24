import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

public class Umsatz implements ActionListener {

	private JFrame frmSollUmsatzRechner;
	private JTextField Ziel;
	private JTextField Post;
	private JTextField Rest;
	private JTextField Anteile;
	private JTextField Aufschlag;
	private JTextField Wolle;
	private JTextField Buero;
	private JTextField Kurzware;
	private JTextField Aufschlag_Wolle;
	private JTextField Aufschlag_Buero;
	private JTextField Aufschlag_Kurzware;
	private JTextField Anteile_Wolle;
	private JTextField Anteile_Buero;
	private JTextField Anteile_Kurzware;
	private JTextField Ausgabe_Umsatz_Woche;
	private JTextField Ausgaben_Umsatz_Monat;
	private JTextField Ausgabe_Umsatz_Tag;
	private JTextField Ausgabe_Umsatz_Jahr;
	private JTextField Zieleingabe;
	private JTextField Post_Eingabe;
	private JTextField Ausgabe_Rest;
	private JTextField Melanie;
	private JTextField Error;
	private JTextField Ausgabe_Einkaufspreis;
	private JTextField Umsatz_Kurz_Jahr;
	private JTextField Umsatz_kurz_Mo;
	private JTextField Umsatz_kurz_Wo;
	private JTextField Umsatz_Buero_Woche;
	private JTextField Umsatz_Buero_Monat;
	private JTextField Umsatz_Buero_jahr;
	private JTextField Ums_Mo_JA;
	private JTextField Umsatz_Mo_WOL;
	private JTextField Umsatz_Wo_WO;
	private JTextField Verkauf_Kurzware;
	private JTextField Einkauf_Kurzware;
	private JTextField Gewinn_Kurzware;
	private JTextField Verkauf_Buero;
	private JTextField Einkauf_Buero;
	private JTextField Gewinn_Buero;
	private JTextField Verkauf_Wolle;
	private JTextField Einkauf_Wolle;
	private JTextField Gewinn_Wolle;
	private JTextField Umsatz_Wo_Tag;
	private JTextField Umsatz_Buero_Tag;
	private JTextField Umsatz_Kurz_Tag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Umsatz window = new Umsatz();
					window.frmSollUmsatzRechner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Umsatz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSollUmsatzRechner = new JFrame();
		frmSollUmsatzRechner.setForeground(new Color(0, 255, 0));
		frmSollUmsatzRechner.setFont(new Font("Arial Black", Font.PLAIN, 12));
		frmSollUmsatzRechner.setTitle("Soll Umsatz Rechner");
		frmSollUmsatzRechner.setResizable(false);
		frmSollUmsatzRechner.getContentPane().setBackground(new Color(192, 192, 192));
		frmSollUmsatzRechner.getContentPane().setForeground(Color.GRAY);
		frmSollUmsatzRechner.setBounds(100, 100, 1139, 841);
		frmSollUmsatzRechner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSollUmsatzRechner.getContentPane().setLayout(null);

		Ziel = new JTextField();
		Ziel.setEditable(false);
		Ziel.setForeground(new Color(0, 0, 160));
		Ziel.setHorizontalAlignment(SwingConstants.CENTER);
		Ziel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Ziel.setBackground(new Color(192, 192, 192));
		Ziel.setText("Ziel \u20AC");
		Ziel.setBounds(135, 49, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Ziel);
		Ziel.setColumns(10);

		Post = new JTextField();
		Post.setEditable(false);
		Post.setForeground(new Color(0, 0, 160));
		Post.setHorizontalAlignment(SwingConstants.CENTER);
		Post.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Post.setBackground(new Color(192, 192, 192));
		Post.setText(" Post \u20AC");
		Post.setBounds(135, 85, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Post);
		Post.setColumns(10);

		Rest = new JTextField();
		Rest.setEditable(false);
		Rest.setForeground(new Color(0, 0, 160));
		Rest.setHorizontalAlignment(SwingConstants.CENTER);
		Rest.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Rest.setBackground(new Color(192, 192, 192));
		Rest.setText("Rest");
		Rest.setBounds(135, 121, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Rest);
		Rest.setColumns(10);

		Anteile = new JTextField();
		Anteile.setEditable(false);
		Anteile.setForeground(new Color(0, 0, 160));
		Anteile.setHorizontalAlignment(SwingConstants.CENTER);
		Anteile.setFont(new Font("Arial Black", Font.BOLD, 14));
		Anteile.setBackground(new Color(192, 192, 192));
		Anteile.setText("Anteile %");
		Anteile.setBounds(667, 11, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Anteile);
		Anteile.setColumns(10);

		Aufschlag = new JTextField();
		Aufschlag.setEditable(false);
		Aufschlag.setForeground(new Color(0, 0, 160));
		Aufschlag.setFont(new Font("Arial Black", Font.BOLD, 14));
		Aufschlag.setBackground(new Color(192, 192, 192));
		Aufschlag.setText("Aufschlag %");
		Aufschlag.setBounds(538, 11, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Aufschlag);
		Aufschlag.setColumns(10);

		Wolle = new JTextField();
		Wolle.setEditable(false);
		Wolle.setForeground(new Color(0, 0, 160));
		Wolle.setHorizontalAlignment(SwingConstants.CENTER);
		Wolle.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Wolle.setBackground(new Color(192, 192, 192));
		Wolle.setText("Wolle");
		Wolle.setBounds(399, 49, 129, 25);
		frmSollUmsatzRechner.getContentPane().add(Wolle);
		Wolle.setColumns(10);

		Buero = new JTextField();
		Buero.setEditable(false);
		Buero.setForeground(new Color(0, 0, 160));
		Buero.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Buero.setBackground(new Color(192, 192, 192));
		Buero.setHorizontalAlignment(SwingConstants.CENTER);
		Buero.setText("B\u00FCromaterial");
		Buero.setBounds(399, 85, 129, 25);
		frmSollUmsatzRechner.getContentPane().add(Buero);
		Buero.setColumns(10);

		Kurzware = new JTextField();
		Kurzware.setEditable(false);
		Kurzware.setForeground(new Color(0, 0, 160));
		Kurzware.setHorizontalAlignment(SwingConstants.CENTER);
		Kurzware.setFont(new Font("Arial Black", Font.PLAIN, 15));
		Kurzware.setBackground(new Color(192, 192, 192));
		Kurzware.setText("Kurzware");
		Kurzware.setBounds(399, 121, 129, 25);
		frmSollUmsatzRechner.getContentPane().add(Kurzware);
		Kurzware.setColumns(10);

		Aufschlag_Wolle = new JTextField();
		Aufschlag_Wolle.setHorizontalAlignment(SwingConstants.CENTER);
		Aufschlag_Wolle.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Aufschlag_Wolle.setBackground(Color.GREEN);
		Aufschlag_Wolle.setBounds(538, 49, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Aufschlag_Wolle);
		Aufschlag_Wolle.setColumns(10);

		Aufschlag_Buero = new JTextField();
		Aufschlag_Buero.setHorizontalAlignment(SwingConstants.CENTER);
		Aufschlag_Buero.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Aufschlag_Buero.setBackground(Color.GREEN);
		Aufschlag_Buero.setBounds(538, 85, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Aufschlag_Buero);
		Aufschlag_Buero.setColumns(10);

		Aufschlag_Kurzware = new JTextField();
		Aufschlag_Kurzware.setHorizontalAlignment(SwingConstants.CENTER);
		Aufschlag_Kurzware.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Aufschlag_Kurzware.setBackground(Color.GREEN);
		Aufschlag_Kurzware.setBounds(538, 121, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Aufschlag_Kurzware);
		Aufschlag_Kurzware.setColumns(10);

		Anteile_Wolle = new JTextField();
		Anteile_Wolle.setHorizontalAlignment(SwingConstants.CENTER);
		Anteile_Wolle.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Anteile_Wolle.setBackground(Color.GREEN);
		Anteile_Wolle.setBounds(667, 49, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Anteile_Wolle);
		Anteile_Wolle.setColumns(10);

		Anteile_Buero = new JTextField();
		Anteile_Buero.setHorizontalAlignment(SwingConstants.CENTER);
		Anteile_Buero.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Anteile_Buero.setBackground(Color.GREEN);
		Anteile_Buero.setBounds(667, 85, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Anteile_Buero);
		Anteile_Buero.setColumns(10);

		Anteile_Kurzware = new JTextField();
		Anteile_Kurzware.setHorizontalAlignment(SwingConstants.CENTER);
		Anteile_Kurzware.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Anteile_Kurzware.setBackground(Color.GREEN);
		Anteile_Kurzware.setBounds(667, 121, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Anteile_Kurzware);
		Anteile_Kurzware.setColumns(10);

		JButton Berechne = new JButton("Berechne");
		Berechne.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Berechne.setForeground(new Color(0, 0, 160));
		Berechne.setBackground(new Color(128, 255, 128));
		Berechne.setBounds(929, 35, 119, 53);
		Berechne.addActionListener(this);
		frmSollUmsatzRechner.getContentPane().add(Berechne);

		Ausgabe_Umsatz_Woche = new JTextField();
		Ausgabe_Umsatz_Woche.setEditable(false);
		Ausgabe_Umsatz_Woche.setForeground(new Color(0, 0, 160));
		Ausgabe_Umsatz_Woche.setFont(new Font("Arial Black", Font.PLAIN, 18));
		Ausgabe_Umsatz_Woche.setHorizontalAlignment(SwingConstants.CENTER);
		Ausgabe_Umsatz_Woche.setBackground(new Color(192, 192, 192));
		Ausgabe_Umsatz_Woche.setBounds(821, 716, 292, 29);
		frmSollUmsatzRechner.getContentPane().add(Ausgabe_Umsatz_Woche);
		Ausgabe_Umsatz_Woche.setColumns(10);

		Ausgaben_Umsatz_Monat = new JTextField();
		Ausgaben_Umsatz_Monat.setEditable(false);
		Ausgaben_Umsatz_Monat.setForeground(new Color(0, 0, 160));
		Ausgaben_Umsatz_Monat.setFont(new Font("Arial Black", Font.PLAIN, 18));
		Ausgaben_Umsatz_Monat.setBackground(new Color(192, 192, 192));
		Ausgaben_Umsatz_Monat.setHorizontalAlignment(SwingConstants.CENTER);
		Ausgaben_Umsatz_Monat.setBounds(821, 636, 292, 29);
		frmSollUmsatzRechner.getContentPane().add(Ausgaben_Umsatz_Monat);
		Ausgaben_Umsatz_Monat.setColumns(10);

		Ausgabe_Umsatz_Tag = new JTextField();
		Ausgabe_Umsatz_Tag.setEditable(false);
		Ausgabe_Umsatz_Tag.setForeground(new Color(0, 0, 160));
		Ausgabe_Umsatz_Tag.setHorizontalAlignment(SwingConstants.CENTER);
		Ausgabe_Umsatz_Tag.setFont(new Font("Arial Black", Font.PLAIN, 18));
		Ausgabe_Umsatz_Tag.setBackground(new Color(192, 192, 192));
		Ausgabe_Umsatz_Tag.setBounds(821, 762, 292, 29);
		frmSollUmsatzRechner.getContentPane().add(Ausgabe_Umsatz_Tag);
		Ausgabe_Umsatz_Tag.setColumns(10);

		Ausgabe_Umsatz_Jahr = new JTextField();
		Ausgabe_Umsatz_Jahr.setEditable(false);
		Ausgabe_Umsatz_Jahr.setForeground(new Color(0, 0, 160));
		Ausgabe_Umsatz_Jahr.setFont(new Font("Arial Black", Font.PLAIN, 18));
		Ausgabe_Umsatz_Jahr.setBackground(new Color(192, 192, 192));
		Ausgabe_Umsatz_Jahr.setHorizontalAlignment(SwingConstants.CENTER);
		Ausgabe_Umsatz_Jahr.setBounds(821, 676, 292, 29);
		frmSollUmsatzRechner.getContentPane().add(Ausgabe_Umsatz_Jahr);
		Ausgabe_Umsatz_Jahr.setColumns(10);

		Zieleingabe = new JTextField();
		Zieleingabe.setHorizontalAlignment(SwingConstants.CENTER);
		Zieleingabe.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Zieleingabe.setBackground(new Color(0, 255, 0));
		Zieleingabe.setForeground(new Color(0, 0, 0));
		Zieleingabe.setBounds(264, 49, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Zieleingabe);
		Zieleingabe.setColumns(10);

		Post_Eingabe = new JTextField();
		Post_Eingabe.setHorizontalAlignment(SwingConstants.CENTER);
		Post_Eingabe.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Post_Eingabe.setBackground(Color.GREEN);
		Post_Eingabe.setForeground(Color.BLACK);
		Post_Eingabe.setBounds(264, 85, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Post_Eingabe);
		Post_Eingabe.setColumns(10);

		Ausgabe_Rest = new JTextField();
		Ausgabe_Rest.setHorizontalAlignment(SwingConstants.CENTER);
		Ausgabe_Rest.setEditable(false);
		Ausgabe_Rest.setForeground(new Color(255, 255, 0));
		Ausgabe_Rest.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Ausgabe_Rest.setBackground(new Color(192, 192, 192));
		Ausgabe_Rest.setBounds(264, 121, 105, 25);
		frmSollUmsatzRechner.getContentPane().add(Ausgabe_Rest);
		Ausgabe_Rest.setColumns(10);

		Melanie = new JTextField();
		Melanie.setForeground(new Color(0, 0, 128));
		Melanie.setEditable(false);
		Melanie.setBackground(new Color(192, 192, 192));
		Melanie.setText("Melanie.B\u00FCckner");
		Melanie.setHorizontalAlignment(SwingConstants.CENTER);
		Melanie.setBounds(10, 770, 129, 20);
		frmSollUmsatzRechner.getContentPane().add(Melanie);
		Melanie.setColumns(10);

		Error = new JTextField();
		Error.setForeground(new Color(128, 255, 0));
		Error.setHorizontalAlignment(SwingConstants.CENTER);
		Error.setFont(new Font("Arial Black", Font.PLAIN, 24));
		Error.setBackground(new Color(192, 192, 192));
		Error.setEditable(false);
		Error.setBounds(186, 730, 469, 61);
		frmSollUmsatzRechner.getContentPane().add(Error);
		Error.setColumns(10);

		Ausgabe_Einkaufspreis = new JTextField();
		Ausgabe_Einkaufspreis.setEditable(false);
		Ausgabe_Einkaufspreis.setForeground(new Color(0, 0, 160));
		Ausgabe_Einkaufspreis.setHorizontalAlignment(SwingConstants.CENTER);
		Ausgabe_Einkaufspreis.setFont(new Font("Arial Black", Font.PLAIN, 18));
		Ausgabe_Einkaufspreis.setBackground(new Color(192, 192, 192));
		Ausgabe_Einkaufspreis.setBounds(821, 596, 292, 29);
		frmSollUmsatzRechner.getContentPane().add(Ausgabe_Einkaufspreis);
		Ausgabe_Einkaufspreis.setColumns(10);

		Umsatz_Kurz_Jahr = new JTextField();
		Umsatz_Kurz_Jahr.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_Kurz_Jahr.setForeground(new Color(255, 255, 0));
		Umsatz_Kurz_Jahr.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_Kurz_Jahr.setBackground(new Color(192, 192, 192));
		Umsatz_Kurz_Jahr.setEditable(false);
		Umsatz_Kurz_Jahr.setBounds(680, 387, 278, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_Kurz_Jahr);
		Umsatz_Kurz_Jahr.setColumns(10);

		Umsatz_kurz_Mo = new JTextField();
		Umsatz_kurz_Mo.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_kurz_Mo.setForeground(new Color(255, 255, 0));
		Umsatz_kurz_Mo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_kurz_Mo.setBackground(new Color(192, 192, 192));
		Umsatz_kurz_Mo.setEditable(false);
		Umsatz_kurz_Mo.setColumns(10);
		Umsatz_kurz_Mo.setBounds(680, 427, 278, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_kurz_Mo);

		Umsatz_kurz_Wo = new JTextField();
		Umsatz_kurz_Wo.setEditable(false);
		Umsatz_kurz_Wo.setForeground(new Color(255, 255, 0));
		Umsatz_kurz_Wo.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_kurz_Wo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_kurz_Wo.setBackground(new Color(192, 192, 192));
		Umsatz_kurz_Wo.setColumns(10);
		Umsatz_kurz_Wo.setBounds(680, 467, 278, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_kurz_Wo);

		Umsatz_Buero_Woche = new JTextField();
		Umsatz_Buero_Woche.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_Buero_Woche.setForeground(new Color(255, 255, 0));
		Umsatz_Buero_Woche.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_Buero_Woche.setEditable(false);
		Umsatz_Buero_Woche.setBackground(new Color(192, 192, 192));
		Umsatz_Buero_Woche.setColumns(10);
		Umsatz_Buero_Woche.setBounds(327, 467, 316, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_Buero_Woche);

		Umsatz_Buero_Monat = new JTextField();
		Umsatz_Buero_Monat.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_Buero_Monat.setEditable(false);
		Umsatz_Buero_Monat.setForeground(new Color(255, 255, 0));
		Umsatz_Buero_Monat.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_Buero_Monat.setBackground(new Color(192, 192, 192));
		Umsatz_Buero_Monat.setColumns(10);
		Umsatz_Buero_Monat.setBounds(327, 427, 316, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_Buero_Monat);

		Umsatz_Buero_jahr = new JTextField();
		Umsatz_Buero_jahr.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_Buero_jahr.setForeground(new Color(255, 255, 0));
		Umsatz_Buero_jahr.setEditable(false);
		Umsatz_Buero_jahr.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_Buero_jahr.setBackground(new Color(192, 192, 192));
		Umsatz_Buero_jahr.setColumns(10);
		Umsatz_Buero_jahr.setBounds(327, 387, 316, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_Buero_jahr);

		Ums_Mo_JA = new JTextField();
		Ums_Mo_JA.setHorizontalAlignment(SwingConstants.CENTER);
		Ums_Mo_JA.setForeground(new Color(255, 255, 0));
		Ums_Mo_JA.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Ums_Mo_JA.setEditable(false);
		Ums_Mo_JA.setBackground(new Color(192, 192, 192));
		Ums_Mo_JA.setColumns(10);
		Ums_Mo_JA.setBounds(55, 387, 251, 29);
		frmSollUmsatzRechner.getContentPane().add(Ums_Mo_JA);

		Umsatz_Mo_WOL = new JTextField();
		Umsatz_Mo_WOL.setEditable(false);
		Umsatz_Mo_WOL.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_Mo_WOL.setForeground(new Color(255, 255, 0));
		Umsatz_Mo_WOL.setBackground(new Color(192, 192, 192));
		Umsatz_Mo_WOL.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_Mo_WOL.setColumns(10);
		Umsatz_Mo_WOL.setBounds(55, 427, 251, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_Mo_WOL);

		Umsatz_Wo_WO = new JTextField();
		Umsatz_Wo_WO.setEditable(false);
		Umsatz_Wo_WO.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_Wo_WO.setForeground(new Color(255, 255, 0));
		Umsatz_Wo_WO.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_Wo_WO.setBackground(new Color(192, 192, 192));
		Umsatz_Wo_WO.setColumns(10);
		Umsatz_Wo_WO.setBounds(55, 467, 251, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_Wo_WO);

		Verkauf_Kurzware = new JTextField();
		Verkauf_Kurzware.setHorizontalAlignment(SwingConstants.CENTER);
		Verkauf_Kurzware.setForeground(new Color(255, 255, 0));
		Verkauf_Kurzware.setEditable(false);
		Verkauf_Kurzware.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Verkauf_Kurzware.setBackground(new Color(192, 192, 192));
		Verkauf_Kurzware.setColumns(10);
		Verkauf_Kurzware.setBounds(578, 312, 231, 29);
		frmSollUmsatzRechner.getContentPane().add(Verkauf_Kurzware);

		Einkauf_Kurzware = new JTextField();
		Einkauf_Kurzware.setHorizontalAlignment(SwingConstants.CENTER);
		Einkauf_Kurzware.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Einkauf_Kurzware.setEditable(false);
		Einkauf_Kurzware.setForeground(new Color(255, 255, 0));
		Einkauf_Kurzware.setBackground(new Color(192, 192, 192));
		Einkauf_Kurzware.setColumns(10);
		Einkauf_Kurzware.setBounds(578, 272, 231, 29);
		frmSollUmsatzRechner.getContentPane().add(Einkauf_Kurzware);

		Gewinn_Kurzware = new JTextField();
		Gewinn_Kurzware.setEditable(false);
		Gewinn_Kurzware.setForeground(new Color(255, 255, 0));
		Gewinn_Kurzware.setHorizontalAlignment(SwingConstants.CENTER);
		Gewinn_Kurzware.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Gewinn_Kurzware.setBackground(new Color(192, 192, 192));
		Gewinn_Kurzware.setColumns(10);
		Gewinn_Kurzware.setBounds(578, 226, 231, 29);
		frmSollUmsatzRechner.getContentPane().add(Gewinn_Kurzware);

		Verkauf_Buero = new JTextField();
		Verkauf_Buero.setEditable(false);
		Verkauf_Buero.setHorizontalAlignment(SwingConstants.CENTER);
		Verkauf_Buero.setForeground(new Color(255, 255, 0));
		Verkauf_Buero.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Verkauf_Buero.setBackground(new Color(192, 192, 192));
		Verkauf_Buero.setColumns(10);
		Verkauf_Buero.setBounds(288, 312, 251, 29);
		frmSollUmsatzRechner.getContentPane().add(Verkauf_Buero);

		Einkauf_Buero = new JTextField();
		Einkauf_Buero.setEditable(false);
		Einkauf_Buero.setHorizontalAlignment(SwingConstants.CENTER);
		Einkauf_Buero.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Einkauf_Buero.setForeground(new Color(255, 255, 0));
		Einkauf_Buero.setBackground(new Color(192, 192, 192));
		Einkauf_Buero.setColumns(10);
		Einkauf_Buero.setBounds(288, 272, 251, 29);
		frmSollUmsatzRechner.getContentPane().add(Einkauf_Buero);

		Gewinn_Buero = new JTextField();
		Gewinn_Buero.setEditable(false);
		Gewinn_Buero.setHorizontalAlignment(SwingConstants.CENTER);
		Gewinn_Buero.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Gewinn_Buero.setForeground(new Color(255, 255, 0));
		Gewinn_Buero.setBackground(new Color(192, 192, 192));
		Gewinn_Buero.setColumns(10);
		Gewinn_Buero.setBounds(288, 226, 251, 29);
		frmSollUmsatzRechner.getContentPane().add(Gewinn_Buero);

		Verkauf_Wolle = new JTextField();
		Verkauf_Wolle.setEditable(false);
		Verkauf_Wolle.setHorizontalAlignment(SwingConstants.CENTER);
		Verkauf_Wolle.setForeground(new Color(255, 255, 0));
		Verkauf_Wolle.setBackground(new Color(192, 192, 192));
		Verkauf_Wolle.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Verkauf_Wolle.setColumns(10);
		Verkauf_Wolle.setBounds(55, 312, 200, 29);
		frmSollUmsatzRechner.getContentPane().add(Verkauf_Wolle);

		Einkauf_Wolle = new JTextField();
		Einkauf_Wolle.setEditable(false);
		Einkauf_Wolle.setHorizontalAlignment(SwingConstants.CENTER);
		Einkauf_Wolle.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Einkauf_Wolle.setBackground(new Color(192, 192, 192));
		Einkauf_Wolle.setForeground(new Color(255, 255, 0));
		Einkauf_Wolle.setColumns(10);
		Einkauf_Wolle.setBounds(55, 272, 200, 29);
		frmSollUmsatzRechner.getContentPane().add(Einkauf_Wolle);

		Gewinn_Wolle = new JTextField();
		Gewinn_Wolle.setEditable(false);
		Gewinn_Wolle.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Gewinn_Wolle.setHorizontalAlignment(SwingConstants.CENTER);
		Gewinn_Wolle.setForeground(new Color(255, 255, 0));
		Gewinn_Wolle.setBackground(new Color(192, 192, 192));
		Gewinn_Wolle.setColumns(10);
		Gewinn_Wolle.setBounds(55, 226, 200, 29);
		frmSollUmsatzRechner.getContentPane().add(Gewinn_Wolle);

		Umsatz_Wo_Tag = new JTextField();
		Umsatz_Wo_Tag.setForeground(new Color(255, 255, 0));
		Umsatz_Wo_Tag.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_Wo_Tag.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_Wo_Tag.setEditable(false);
		Umsatz_Wo_Tag.setBackground(new Color(192, 192, 192));
		Umsatz_Wo_Tag.setColumns(10);
		Umsatz_Wo_Tag.setBounds(55, 507, 251, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_Wo_Tag);

		Umsatz_Buero_Tag = new JTextField();
		Umsatz_Buero_Tag.setEditable(false);
		Umsatz_Buero_Tag.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_Buero_Tag.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_Buero_Tag.setForeground(new Color(255, 255, 0));
		Umsatz_Buero_Tag.setBackground(new Color(192, 192, 192));
		Umsatz_Buero_Tag.setColumns(10);
		Umsatz_Buero_Tag.setBounds(327, 507, 316, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_Buero_Tag);

		Umsatz_Kurz_Tag = new JTextField();
		Umsatz_Kurz_Tag.setHorizontalAlignment(SwingConstants.CENTER);
		Umsatz_Kurz_Tag.setFont(new Font("Arial Black", Font.PLAIN, 14));
		Umsatz_Kurz_Tag.setBackground(new Color(192, 192, 192));
		Umsatz_Kurz_Tag.setForeground(new Color(255, 255, 0));
		Umsatz_Kurz_Tag.setEditable(false);
		Umsatz_Kurz_Tag.setColumns(10);
		Umsatz_Kurz_Tag.setBounds(680, 507, 278, 29);
		frmSollUmsatzRechner.getContentPane().add(Umsatz_Kurz_Tag);

		JButton Zuruecksetzen = new JButton("Reset");
		Zuruecksetzen.setForeground(new Color(0, 0, 160));
		Zuruecksetzen.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Zuruecksetzen.setBackground(new Color(128, 255, 128));
		Zuruecksetzen.setBounds(929, 111, 119, 53);
		Zuruecksetzen.addActionListener(this);
		frmSollUmsatzRechner.getContentPane().add(Zuruecksetzen);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Error.setText("");
		if (e.getActionCommand().equals("Berechne")) {
			this.calculate();
		} else if (e.getActionCommand().equals("Reset")) {
			this.reset();
		} else {
			System.err.println(
					String.format("Irgendwas l�uft schief, den Button %s kenne ich nicht.", e.getActionCommand()));
		}
	}

	private void calculate() {

		double ziel = 0;
		double post = 0;
		double aufschlagWolle = 0;
		double aufschlagBuero = 0;
		double aufschlagKurzware = 0;
		double anteilWolle = 0;
		double anteilKurzware = 0;
		double anteilBuero = 0;

	

		try {

			ziel = Double.parseDouble(Zieleingabe.getText());
			post = Double.parseDouble(Post_Eingabe.getText());
			aufschlagWolle = Double.parseDouble(Aufschlag_Wolle.getText()) / 100.0;
			aufschlagBuero = Double.parseDouble(Aufschlag_Buero.getText()) / 100.0;
			aufschlagKurzware = Double.parseDouble(Aufschlag_Kurzware.getText()) / 100.0;
			anteilWolle = Double.parseDouble(Anteile_Wolle.getText()) / 100.0;
			anteilKurzware = Double.parseDouble(Anteile_Kurzware.getText()) / 100.0;
			anteilBuero = Double.parseDouble(Anteile_Buero.getText()) / 100.0;

		} catch (NumberFormatException e) {
			Error.setText("Bitte nur Zahlen eingeben");
			return;
		}

		Rechner rechner = new Rechner();
		rechner.berechne(ziel, post, aufschlagWolle, aufschlagBuero, aufschlagKurzware, anteilWolle, anteilBuero,
				anteilKurzware);

		Ausgabe_Rest.setText(String.format("%5.2f€", rechner.getRest()));
		Ausgaben_Umsatz_Monat.setText(String.format("Umsatz Monat %5.2f€", rechner.getUmsatzMonat()));
		Ausgabe_Umsatz_Jahr.setText(String.format("Umsatz Jahr %5.2f€", rechner.getUmsatzJahr()));
		Ausgabe_Umsatz_Woche.setText(String.format("Umsatz Woche %5.2f€", rechner.getUmsatzWoche()));
		Ausgabe_Umsatz_Tag.setText(String.format("Umsatz Tag %5.2f€", rechner.getUmsatzTag()));
		Ausgabe_Einkaufspreis.setText(String.format("Einkaufspreis %5.2f€", rechner.getEinkaufspreis()));
		Gewinn_Wolle.setText(String.format("Gewinn Wolle %5.2f€", rechner.getWolle().getGewinn()));
		Einkauf_Wolle.setText(String.format("Einkauf Wolle %5.2f€", rechner.getWolle().getEinkauf()));
		Verkauf_Wolle.setText(String.format("Verkauf Wolle %5.2f€", rechner.getWolle().getVerkauf()));
		Gewinn_Buero.setText(String.format("Gewinn Bueromaterial %5.2f€", rechner.getBuero().getGewinn()));
		Einkauf_Buero.setText(String.format("Einkauf Bueromaterial %5.2f€", rechner.getBuero().getEinkauf()));
		Verkauf_Buero.setText(String.format("Verkauf Bueromaterial %5.2f€", rechner.getBuero().getVerkauf()));
		Gewinn_Kurzware.setText(String.format("Gewinn Kurzware %5.2f€", rechner.getKurzwaren().getGewinn()));
		Einkauf_Kurzware.setText(String.format("Einkauf Kurzware %5.2f€", rechner.getKurzwaren().getEinkauf()));
		Verkauf_Kurzware.setText(String.format("Verkauf Kurzware %5.2f€", rechner.getKurzwaren().getVerkauf()));
		Ums_Mo_JA.setText(String.format("Umsatz Wolle Jahr %5.2f€", rechner.getWolle().getUmsatzJahr()));
		Umsatz_Mo_WOL.setText(String.format("Umsatz Wolle Monat %5.2f€", rechner.getWolle().getUmsatzMonat()));
		Umsatz_Wo_WO.setText(String.format("Umsatz Wolle Woche %5.2f€", rechner.getWolle().getUmsatzWoche()));
		Umsatz_Wo_Tag.setText(String.format("Umsatz Wolle Tag %5.2f€", rechner.getWolle().getUmsatzTag()));
		Umsatz_Buero_jahr.setText(String.format("Umsatz Bueromaterial Jahr %5.2f€", rechner.getBuero().getUmsatzJahr()));
		Umsatz_Buero_Monat
				.setText(String.format("Umsatz Bueromaterial Monat %5.2f€", rechner.getBuero().getUmsatzMonat()));
		Umsatz_Buero_Woche
				.setText(String.format("Umsatz Bueromaterial Woche %5.2f€", rechner.getBuero().getUmsatzWoche()));
		Umsatz_Buero_Tag.setText(String.format("Umsatz Bueromaterial Tag %5.2f€", rechner.getBuero().getUmsatzTag()));
		Umsatz_Kurz_Jahr.setText(String.format("Umsatz Kurzware Jahr %5.2f€", rechner.getKurzwaren().getUmsatzJahr()));
		Umsatz_kurz_Mo.setText(String.format("Umsatz Kurzware Monat %5.2f€", rechner.getKurzwaren().getUmsatzMonat()));
		Umsatz_kurz_Wo.setText(String.format("Umsatz Kurzware Woche %5.2f€", rechner.getKurzwaren().getUmsatzWoche()));
		Umsatz_Kurz_Tag.setText(String.format("Umsatz Kurzware Tag %5.2f€", rechner.getKurzwaren().getUmsatzTag()));
	}
	
	private void reset() {
		System.out.println("reset");
		Zieleingabe.setText("");
		Post_Eingabe.setText("");
		Aufschlag_Wolle.setText("");
		Aufschlag_Buero.setText("");
		Aufschlag_Kurzware.setText("");
		Anteile_Wolle.setText("");
		Anteile_Kurzware.setText("");
		Anteile_Buero.setText("");
		Ausgabe_Rest.setText("");
		Ausgaben_Umsatz_Monat.setText("");
		Ausgabe_Umsatz_Jahr.setText("");
		Ausgabe_Umsatz_Woche.setText("");
		Ausgabe_Umsatz_Tag.setText("");
		Ausgabe_Einkaufspreis.setText("");
		Gewinn_Wolle.setText("");
		Einkauf_Wolle.setText("");
		Verkauf_Wolle.setText("");
		Gewinn_Buero.setText("");
		Einkauf_Buero.setText("");
		Verkauf_Buero.setText("");
		Gewinn_Kurzware.setText("");
		Einkauf_Kurzware.setText("");
		Verkauf_Kurzware.setText("");
		Ums_Mo_JA.setText("");
		Umsatz_Mo_WOL.setText("");
		Umsatz_Wo_WO.setText("");
		Umsatz_Wo_Tag.setText("");
		Umsatz_Buero_jahr.setText("");
		Umsatz_Buero_Monat.setText("");
		Umsatz_Buero_Woche.setText("");
		Umsatz_Buero_Tag.setText("");
		Umsatz_Kurz_Jahr.setText("");
		Umsatz_kurz_Mo.setText("");
		Umsatz_kurz_Wo.setText("");
		Umsatz_Kurz_Tag.setText("");
	
	}
}
