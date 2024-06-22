package MineSweeper;

public class Show_GUI {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				MineSweeperGUI MS = new MineSweeperGUI();
			}
		});

	}

}

