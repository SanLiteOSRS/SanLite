import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public abstract class class406 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	class406 field4521;
	@ObfuscatedName("at")
	String field4522;
	@ObfuscatedName("ac")
	String field4523;
	@ObfuscatedName("ai")
	boolean field4524;
	@ObfuscatedName("az")
	boolean field4525;

	@ObfuscatedSignature(
		descriptor = "(Lpm;)V"
	)
	class406(class406 var1) {
		this.field4521 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public abstract boolean vmethod7621();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	public boolean method7598() {
		return this.field4524; // L: 17
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1850076782"
	)
	public boolean method7603() {
		return this.field4525; // L: 21
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2126528347"
	)
	public String method7595() {
		return "Error in task: " + this.field4523 + ", Error message: " + this.field4522; // L: 25
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)Lpm;",
		garbageValue = "255"
	)
	public class406 method7600() {
		return this.field4521; // L: 29
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "14"
	)
	void method7601(String var1) {
		this.field4524 = true; // L: 33
		this.field4522 = var1; // L: 34
	} // L: 35

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-7"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1563316878"
	)
	public static int method7613(int var0) {
		return class464.field4787[var0 & 16383]; // L: 32
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Lmi;IIIIIIB)V",
		garbageValue = "-68"
	)
	static final void method7612(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field611) { // L: 11123
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11124
		}

		Client.field611 = false; // L: 11125
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class183.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11126
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11127
				var0.scrollY -= 4; // L: 11128
				class218.invalidateWidget(var0); // L: 11129
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11131
				var0.scrollY += 4; // L: 11132
				class218.invalidateWidget(var0); // L: 11133
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11135
				var7 = var3 * (var3 - 32) / var4; // L: 11136
				if (var7 < 8) { // L: 11137
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11138
				int var9 = var3 - 32 - var7; // L: 11139
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11140
				class218.invalidateWidget(var0); // L: 11141
				Client.field611 = true; // L: 11142
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11145
			var7 = var0.width; // L: 11146
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11147
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11148
				class218.invalidateWidget(var0); // L: 11149
			}
		}

	} // L: 11152
}
