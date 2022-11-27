import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.Toolkit;
public class CopyCommand implements ICommand {

	@Override
	public void excute(String str) {
		StringSelection s=new StringSelection(str);
		Clipboard c= Toolkit.getDefaultToolkit().getSystemClipboard();
		c.setContents(s, null);
		return;
		
	}

}
