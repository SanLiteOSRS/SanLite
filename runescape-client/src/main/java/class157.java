import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class157 extends class143 {
	@ObfuscatedName("gt")
	static String field1762;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1983663825
	)
	static int field1767;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2110993829
	)
	int field1763;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class157(class146 var1) {
		this.this$0 = var1;
		this.field1763 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1763 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3188(this.field1763); // L: 222
	} // L: 223

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "255"
	)
	static boolean method3256(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 1094
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-858591877"
	)
	public static String method3260(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length()); // L: 159
		int var2 = 0; // L: 160
		int var3 = -1; // L: 161

		for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 162
			char var5 = var0.charAt(var4); // L: 163
			if (var5 == '<') { // L: 164
				var1.append(var0.substring(var2, var4)); // L: 165
				var3 = var4; // L: 166
			} else if (var5 == '>' && var3 != -1) { // L: 169
				String var6 = var0.substring(var3 + 1, var4); // L: 170
				var3 = -1; // L: 171
				if (var6.equals("lt")) { // L: 172
					var1.append("<"); // L: 173
				} else if (var6.equals("gt")) { // L: 175
					var1.append(">"); // L: 176
				} else if (var6.equals("br")) { // L: 178
					var1.append("\n"); // L: 179
				}

				var2 = var4 + 1; // L: 181
			}
		}

		if (var2 < var0.length()) { // L: 184
			var1.append(var0.substring(var2, var0.length())); // L: 185
		}

		return var1.toString(); // L: 187
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "6"
	)
	static void method3261(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) { // L: 3612
			int var5 = (Integer)var0.get(0); // L: 3615
			if (var5 == -1 && !Client.playingJingle) { // L: 3616
				Script.method2180(0, 0); // L: 3617
			} else if (var5 != -1 && !class172.method3457(var5) && class449.clientPreferences.method2451() != 0) { // L: 3619
				ArrayList var6 = new ArrayList(); // L: 3620

				for (int var7 = 0; var7 < var0.size(); ++var7) { // L: 3621
					var6.add(new class317(class385.archive11, (Integer)var0.get(var7), 0, class449.clientPreferences.method2451(), false)); // L: 3622
				}

				if (Client.playingJingle) { // L: 3624
					class305.field3405.clear(); // L: 3626
					class305.field3405.addAll(var6); // L: 3627
					class270.method5491(var1, var2, var3, var4); // L: 3628
				} else {
					class53.method1097(var6, var1, var2, var3, var4, false); // L: 3632
				}
			}

		}
	} // L: 3613 3635
}
