import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("UserComparator2")
public class UserComparator2 implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 419330147
	)
	public static int field4359;
	@ObfuscatedName("i")
	@Export("reversed")
	final boolean reversed;

	public UserComparator2(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;B)I",
		garbageValue = "86"
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
}
