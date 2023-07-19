import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class18 {
	@ObfuscatedName("ai")
	Future field88;
	@ObfuscatedName("aj")
	String field85;

	class18(Future var1) {
		this.field88 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method289(var1); // L: 14
	} // L: 15

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "156"
	)
	void method289(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field85 = var1; // L: 19
		if (this.field88 != null) { // L: 20
			this.field88.cancel(true); // L: 21
			this.field88 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "64"
	)
	public final String method290() {
		return this.field85;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2116090761"
	)
	public boolean method291() {
		return this.field85 != null || this.field88 == null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1974975492"
	)
	public final boolean method292() {
		return this.method291() ? true : this.field88.isDone(); // L: 35 36
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lae;",
		garbageValue = "120"
	)
	public final class20 method293() {
		if (this.method291()) { // L: 40
			return new class20(this.field85);
		} else if (!this.method292()) {
			return null; // L: 41
		} else {
			try {
				return (class20)this.field88.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method289(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)I",
		garbageValue = "-17790"
	)
	public static int method304(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 25
			int var6 = var3; // L: 26
			var3 = var4; // L: 27
			var4 = var6; // L: 28
		}

		var2 &= 3; // L: 30
		if (var2 == 0) { // L: 31
			return var0;
		} else if (var2 == 1) { // L: 32
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 33 34
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Ldr;",
		garbageValue = "1928812449"
	)
	static Script method300(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 65
		if (var2 != null) { // L: 66
			return var2; // L: 67
		} else {
			String var3 = String.valueOf(var0); // L: 69
			int var4 = class359.archive12.getGroupId(var3); // L: 70
			if (var4 == -1) { // L: 71
				return null; // L: 72
			} else {
				byte[] var5 = class359.archive12.takeFileFlat(var4); // L: 74
				if (var5 != null) { // L: 75
					if (var5.length <= 1) { // L: 76
						return null; // L: 77
					}

					var2 = SpriteMask.newScript(var5); // L: 79
					if (var2 != null) { // L: 80
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 81
						return var2; // L: 82
					}
				}

				return null; // L: 85
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1543985389"
	)
	static void method303() {
		Login.worldSelectOpen = false; // L: 2185
		class372.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2186
		class391.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2187
		Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 2188
	} // L: 2189

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lme;IIIIIII)V",
		garbageValue = "1141008267"
	)
	static final void method302(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field580) { // L: 11119
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11120
		}

		Client.field580 = false; // L: 11121
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11122
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11123
				var0.scrollY -= 4; // L: 11124
				class303.invalidateWidget(var0); // L: 11125
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11127
				var0.scrollY += 4; // L: 11128
				class303.invalidateWidget(var0); // L: 11129
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11131
				var7 = var3 * (var3 - 32) / var4; // L: 11132
				if (var7 < 8) { // L: 11133
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11134
				int var9 = var3 - 32 - var7; // L: 11135
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11136
				class303.invalidateWidget(var0); // L: 11137
				Client.field580 = true; // L: 11138
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11141
			var7 = var0.width; // L: 11142
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11143
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11144
				class303.invalidateWidget(var0); // L: 11145
			}
		}

	} // L: 11148
}
