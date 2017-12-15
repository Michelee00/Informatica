package alberobindiricerca;

public class NodoConcDopp<T> {
	protected T info;
	protected NodoConcDopp<T> left;
	protected NodoConcDopp<T> right;

	protected NodoConcDopp(T info, NodoConcDopp left, NodoConcDopp rigth) {
		this.info = info;
		this.left = left;
		this.right = right;
	}
}
