import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class class385 {
	@ObfuscatedName("au")
	static char[] field4428;
	@ObfuscatedName("ae")
	static char[] field4429;
	@ObfuscatedName("ao")
	static char[] field4427;
	@ObfuscatedName("at")
	static int[] field4426;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive11")
	static Archive archive11;

	static {
		field4428 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4428[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4428[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4428[var0] = (char)(var0 + 48 - 52);
		}

		field4428[62] = '+'; // L: 11
		field4428[63] = '/'; // L: 12
		field4429 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4429[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4429[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4429[var0] = (char)(var0 + 48 - 52);
		}

		field4429[62] = '*'; // L: 22
		field4429[63] = '-'; // L: 23
		field4427 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4427[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4427[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4427[var0] = (char)(var0 + 48 - 52);
		}

		field4427[62] = '-'; // L: 33
		field4427[63] = '_'; // L: 34
		field4426 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4426.length; ++var0) { // L: 41
			field4426[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4426[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4426[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4426[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4426; // L: 45
		field4426[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4426; // L: 48
		field4426[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1294395846"
	)
	public static String method7165(CharSequence var0) {
		String var1 = class211.base37DecodeLong(class134.method3049(var0)); // L: 57
		if (var1 == null) {
			var1 = ""; // L: 58
		}

		return var1; // L: 59
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "12"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		UserComparator8.method2874(var0, var1, var2, var3, var4, var5, -1, false); // L: 10223
	} // L: 10224

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "189486485"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ModeWhere.loadInterface(var0)) { // L: 11945
			class212.runComponentCloseListeners(PacketBufferNode.Widget_interfaceComponents[var0], var1); // L: 11946
		}
	} // L: 11947

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-85"
	)
	static final void method7164(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12275
		class449.clientPreferences.updateSoundEffectVolume(var0); // L: 12276
	} // L: 12277
}
