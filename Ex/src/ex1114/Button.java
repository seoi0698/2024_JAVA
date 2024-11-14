package ex1114;

public class Button {
	OnClickListener Listener;
	
	public void SetOnClickListener(OnClickListener Listener) {
		this.Listener = Listener;	}

	public void Touch() {
		if(Listener != null)
			Listener.OnClick();
	}
}
