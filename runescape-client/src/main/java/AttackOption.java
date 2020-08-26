import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cd")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("AttackOption_leftClickWhereAvailable")
	AttackOption_leftClickWhereAvailable(2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3);

	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1798928251
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)Llp;",
		garbageValue = "-1998919890"
	)
	static SpritePixels method2155() {
		SpritePixels var0 = new SpritePixels();
		var0.width = class335.SpriteBuffer_spriteWidth;
		var0.height = class335.SpriteBuffer_spriteHeight;
		var0.xOffset = Username.SpriteBuffer_xOffsets[0];
		var0.yOffset = class335.SpriteBuffer_yOffsets[0];
		var0.subWidth = class335.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class335.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subWidth * var0.subHeight;
		byte[] var2 = class92.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = TaskHandler.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		Username.SpriteBuffer_xOffsets = null;
		class335.SpriteBuffer_yOffsets = null;
		class335.SpriteBuffer_spriteWidths = null;
		class335.SpriteBuffer_spriteHeights = null;
		TaskHandler.SpriteBuffer_spritePalette = null;
		class92.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "1687533627"
	)
	static int method2152(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Canvas.field438 : class3.field12;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "1971905807"
	)
	static final void method2154(boolean var0) {
		RouteStrategy.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.field713 && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = Client.getPacketBufferNode(ClientPacket.field2267, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.field713 = true;
				}
			}

		}
	}
}
