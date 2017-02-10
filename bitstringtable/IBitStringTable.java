package positronic.satisfiability.bitstringtable;

import positronic.satisfiability.bitstring.IBitString;
import positronic.util.ArrayListSet;

public interface IBitStringTable
{
  IBitString getBitString(int i) throws Exception;
  String getName();
  ArrayListSet<IBitString> toList() throws Exception;
	IBitString[] toArray(IBitString[] bitStrings);
}