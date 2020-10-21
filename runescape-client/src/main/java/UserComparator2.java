import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("UserComparator2")
public class UserComparator2 implements Comparator {
	@ObfuscatedName("k")
	static byte[][][] field3859;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator2(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljh;Ljh;I)I",
		garbageValue = "-74930835"
	)
	@Export("compare_bridged")
	int compare_bridged(Nameable var1, Nameable var2) {
		return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Nameable)var1, (Nameable)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "788090268"
	)
	static void method6067(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetClickMasks.first(); var1 != null; var1 = (IntegerNode)Client.widgetClickMasks.next()) {
			if ((long)var0 == (var1.key >> 48 & 65535L)) {
				var1.remove();
			}
		}

	}
}
