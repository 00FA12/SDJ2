package Example;

public interface State {
  void coin(Turnstile turnstile);
  void pass(Turnstile turnstile);
  void onEntry(Turnstile turnstile);
}