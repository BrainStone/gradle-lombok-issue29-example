package test;

import com.google.common.base.Preconditions;

public class Test {
  public static void main(String[] args) {
    Preconditions.checkArgument(args.length == 0, "No arguments allowed!");
  }
}
