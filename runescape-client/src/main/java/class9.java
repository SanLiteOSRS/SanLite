import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("r")
public class class9 implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	public static final class9 field42;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	public static final class9 field39;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field43;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field41;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field46;
	@ObfuscatedName("ie")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("mouseWheel")
	static class165 mouseWheel;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 347878083
	)
	int field48;
	@ObfuscatedName("y")
	String field44;
	@ObfuscatedName("d")
	boolean field45;
	@ObfuscatedName("n")
	boolean field38;

	static {
		field42 = new class9(0, "POST", true, true); // L: 6
		field39 = new class9(1, "GET", true, false); // L: 7
		field43 = new class9(2, "PUT", false, true); // L: 8
		field41 = new class9(3, "PATCH", false, true);
		field46 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field48 = var1;
		this.field44 = var2;
		this.field45 = var3; // L: 19
		this.field38 = var4;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field48;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2103039666"
	)
	boolean method73() {
		return this.field45;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1133174080"
	)
	public String method70() {
		return this.field44;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1967949034"
	)
	boolean method62() {
		return this.field38;
	}

	@ObfuscatedName("a")
	public static final int method72(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (var2 + 1.0D) * var4;
			} else {
				var12 = var4 + var2 - var2 * var4; // L: 15
			}

			double var14 = 2.0D * var4 - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (6.0D * var16 < 1.0D) { // L: 22
				var6 = var14 + var16 * (var12 - var14) * 6.0D;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) { // L: 24
				var6 = 6.0D * (var12 - var14) * (0.6666666666666666D - var16) + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var0 * 6.0D * (var12 - var14) + var14;
			} else if (var0 * 2.0D < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14); // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (6.0D * var20 < 1.0D) { // L: 30
				var10 = var20 * 6.0D * (var12 - var14) + var14;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = (0.6666666666666666D - var20) * (var12 - var14) * 6.0D + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "900581302"
	)
	static SecureRandom method74() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "-94"
	)
	static final boolean method75(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 134
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 135
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 136
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false; // L: 137
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 138
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 139
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 140
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 141
				}
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "23"
	)
	static int method76(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 1547
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1548
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class167.Widget_unpackTargetMask(class197.getWidgetFlags(var3)); // L: 1549
			return 1; // L: 1550
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1552
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1559
				if (var3.dataText == null) { // L: 1560
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1561
				}

				return 1; // L: 1562
			} else {
				return 2; // L: 1564
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1553
			--var4; // L: 1554
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1555
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1556
			} else {
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1557
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "17"
	)
	static int method66(int var0, Script var1, boolean var2) {
		return 2; // L: 4898
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1744196611"
	)
	static void method61() {
		PacketBufferNode var0 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3058, Client.packetWriter.isaacCipher); // L: 4455
		var0.packetBuffer.writeByte(class13.getWindowedMode()); // L: 4456
		var0.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 4457
		var0.packetBuffer.writeShort(class10.canvasHeight); // L: 4458
		Client.packetWriter.addNode(var0); // L: 4459
	} // L: 4460
}
