import java.security.SecureRandom;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("fv")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("i")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;I)I",
		garbageValue = "1981135103"
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([Lkl;IB)Lkl;",
		garbageValue = "1"
	)
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			MouseWheel var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}
}
