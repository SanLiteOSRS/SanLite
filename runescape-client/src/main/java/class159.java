import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class159 extends class145 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 66299273
	)
	@Export("SpriteBuffer_spriteWidth")
	public static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("bi")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1325270049
	)
	int field1743;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class159(class148 var1) {
		this.this$0 = var1;
		this.field1743 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1743 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3246(this.field1743); // L: 222
	} // L: 223

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-914201451"
	)
	static boolean method3332() {
		Date var0;
		try {
			var0 = class20.method295(); // L: 1179
		} catch (ParseException var7) { // L: 1181
			class19.method285("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1182
			return false; // L: 1183
		}

		if (var0 == null) { // L: 1185
			return false; // L: 1186
		} else {
			java.util.Calendar var2 = java.util.Calendar.getInstance(); // L: 1190
			var2.set(1, var2.get(1) - 13); // L: 1191
			var2.set(5, var2.get(5) + 1); // L: 1192
			var2.set(11, 0); // L: 1193
			var2.set(12, 0); // L: 1194
			var2.set(13, 0); // L: 1195
			var2.set(14, 0); // L: 1196
			Date var3 = var2.getTime(); // L: 1197
			boolean var4 = var0.before(var3); // L: 1198
			boolean var6 = class231.method4387(var0); // L: 1201
			if (!var6) { // L: 1202
				class19.method285("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1203
				return false; // L: 1204
			} else {
				if (!var4) { // L: 1206
					class153.field1693 = 8388607; // L: 1207
				} else {
					class153.field1693 = (int)(var0.getTime() / 86400000L - 11745L); // L: 1210
				}

				return true; // L: 1212
			}
		}
	}
}
