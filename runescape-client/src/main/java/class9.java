import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class9 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	public static final class9 field33;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	public static final class9 field31;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	static final class9 field32;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	static final class9 field43;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	static final class9 field34;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static Archive field38;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 1521018055
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -619065619
	)
	int field41;
	@ObfuscatedName("av")
	String field36;
	@ObfuscatedName("an")
	boolean field37;
	@ObfuscatedName("au")
	boolean field40;

	static {
		field33 = new class9(0, "POST", true, true); // L: 6
		field31 = new class9(1, "GET", true, false); // L: 7
		field32 = new class9(2, "PUT", false, true); // L: 8
		field43 = new class9(3, "PATCH", false, true);
		field34 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field41 = var1; // L: 17
		this.field36 = var2; // L: 18
		this.field37 = var3; // L: 19
		this.field40 = var4;
	} // L: 21

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field41; // L: 37
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-870766339"
	)
	boolean method71() {
		return this.field37; // L: 24
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-83"
	)
	public String method72() {
		return this.field36; // L: 28
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1743551685"
	)
	boolean method73() {
		return this.field40; // L: 32
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-658647851"
	)
	static void method87() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 99
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 100
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 101
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 102
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 103
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 104
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 105
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 106
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 107
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 108
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 109
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 110
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 111
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 114
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 115
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 116
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 117
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 118
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 119
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 120
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 121
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 122
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 123
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 124
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 125
		}

	} // L: 127

	@ObfuscatedName("ai")
	public static final void method82(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31
}
