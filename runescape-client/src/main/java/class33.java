import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class33 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1303528101
	)
	int field170;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -832417801
	)
	int field174;

	class33(int var1, int var2) {
		this.field170 = var1; // L: 14
		this.field174 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbs;B)Z",
		garbageValue = "2"
	)
	boolean method472(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field170) { // L: 20
			case 1:
				return var1.vmethod4075(this.field174); // L: 24
			case 2:
				return var1.vmethod4086(this.field174); // L: 28
			case 3:
				return var1.vmethod4077((char)this.field174); // L: 22
			case 4:
				return var1.vmethod4100(this.field174 == 1); // L: 30
			default:
				return false; // L: 26
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-478775215"
	)
	static void method475() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 70

		while (var0.hasNext()) { // L: 75
			Message var1 = (Message)var0.next(); // L: 71
			var1.clearIsFromIgnored(); // L: 73
		}

	} // L: 76

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public static String method471(String var0) {
		int var1 = var0.length(); // L: 183
		char[] var2 = new char[var1]; // L: 184
		byte var3 = 2; // L: 185

		for (int var4 = 0; var4 < var1; ++var4) { // L: 186
			char var5 = var0.charAt(var4); // L: 187
			if (var3 == 0) { // L: 188
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 189
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 192
					var6 = Character.toTitleCase(var5); // L: 196
				} else {
					var6 = var5; // L: 193
				}

				var5 = var6; // L: 198
			}

			if (Character.isLetter(var5)) {
				var3 = 0; // L: 200
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 201
				if (Character.isSpaceChar(var5)) { // L: 202
					if (var3 != 2) { // L: 203
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 205
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 206
		}

		return new String(var2); // L: 208
	}
}
