import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("LoginPacket")
public class LoginPacket implements class304 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	public static final LoginPacket field3377;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static final LoginPacket field3378;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	public static final LoginPacket field3383;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	public static final LoginPacket field3380;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	public static final LoginPacket field3379;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static final LoginPacket field3382;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Llo;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1833504593
	)
	@Export("id")
	public final int id;

	static {
		field3377 = new LoginPacket(14, 0); // L: 5
		field3378 = new LoginPacket(15, 4); // L: 6
		field3383 = new LoginPacket(16, -2); // L: 7
		field3380 = new LoginPacket(18, -2); // L: 8
		field3379 = new LoginPacket(19, -2); // L: 9
		field3382 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = class36.method708(); // L: 15

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 16
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lgz;",
		garbageValue = "2140543068"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 19
			var1 = new InvDefinition(); // L: 20
			if (var2 != null) { // L: 21
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "216092039"
	)
	public static void method5936() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-63"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4628
			byte var2 = 4; // L: 4629
			int var3 = var2 + 6; // L: 4630
			int var4 = var2 + 6; // L: 4631
			int var5 = ItemLayer.fontPlain12.lineWidth(var0, 250); // L: 4632
			int var6 = ItemLayer.fontPlain12.lineCount(var0, 250) * 13; // L: 4633
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0); // L: 4634
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 16777215); // L: 4635
			ItemLayer.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4636
			int var7 = var3 - var2; // L: 4637
			int var8 = var4 - var2; // L: 4638
			int var9 = var2 + var2 + var5; // L: 4639
			int var10 = var2 + var2 + var6; // L: 4640

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4642
				if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 4643
					Client.field708[var11] = true;
				}
			}

			if (var1) { // L: 4646
				class338.rasterProvider.drawFull(0, 0); // L: 4647
			} else {
				SoundSystem.method867(var3, var4, var5, var6); // L: 4650
			}

		}
	} // L: 4652
}
