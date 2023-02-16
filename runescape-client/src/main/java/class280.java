import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class280 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3179;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3172;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3173;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3174;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3175;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3178;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3176;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3171;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3183;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3180;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3181;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3182;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	public static final class280 field3177;

	static {
		field3179 = new class280(15); // L: 5
		field3172 = new class280(14); // L: 6
		field3173 = new class280(16); // L: 7
		field3174 = new class280(7); // L: 8
		field3175 = new class280(7); // L: 9
		field3178 = new class280(4); // L: 10
		field3176 = new class280(5); // L: 11
		field3171 = new class280(2); // L: 12
		field3183 = new class280(6); // L: 13
		field3180 = new class280(4); // L: 14
		field3181 = new class280(14); // L: 15
		field3182 = new class280(5); // L: 16
		field3177 = new class280(11); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "15"
	)
	class280(int var1) {
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1260897554"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class134.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1433537546"
	)
	static int method5545(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}
}
