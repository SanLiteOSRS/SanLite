import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	static final LoginType field4088;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	static final LoginType field4085;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	static final LoginType field4084;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	static final LoginType field4087;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	static final LoginType field4094;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	static final LoginType field4089;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	static final LoginType field4091;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	public static final LoginType field4086;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1665967971
	)
	final int field4092;
	@ObfuscatedName("l")
	final String field4093;

	static {
		oldscape = new LoginType(0, 0, "", "");
		field4088 = new LoginType(8, 1, "", "");
		field4085 = new LoginType(6, 2, "", "");
		field4084 = new LoginType(2, 3, "", "");
		field4087 = new LoginType(4, 4, "", "");
		field4094 = new LoginType(1, 5, "", "");
		field4089 = new LoginType(3, 6, "", "");
		field4091 = new LoginType(7, 7, "", "");
		field4086 = new LoginType(5, -1, "", "", true, new LoginType[]{oldscape, field4088, field4085, field4087, field4084});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4092 = var1;
		this.field4093 = var4;
	}

	@ObfuscatedSignature(
		signature = "(IILjava/lang/String;Ljava/lang/String;Z[Lmf;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4092 = var1;
		this.field4093 = var4;
	}

	public String toString() {
		return this.field4093;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		signature = "(Lhu;IIIIIII)V",
		garbageValue = "14464839"
	)
	static final void method6344(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field669) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field669 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class29.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class29.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class29.invalidateWidget(var0);
				Client.field669 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class29.invalidateWidget(var0);
			}
		}

	}
}
