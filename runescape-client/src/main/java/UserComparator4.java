import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("f")
	static String[] field2005;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("z")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lko;Lko;I)I",
		garbageValue = "1508747808"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
