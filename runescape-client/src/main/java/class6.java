import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("k")
public class class6 extends class14 {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		signature = "[Low;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 1971024859
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -394718965
	)
	int field49;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1266108419
	)
	int field46;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class6(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field49 = var1.readInt();
		this.field46 = var1.readInt();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method178(this.field49, this.field46);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lir;I)V",
		garbageValue = "620748591"
	)
	public static void method97(AbstractArchive var0) {
		ParamDefinition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Lgy;",
		garbageValue = "629458679"
	)
	public static PacketBufferNode method98() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var0 = new PacketBufferNode();
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(ILcc;ZB)I",
		garbageValue = "1"
	)
	static int method96(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else if (var0 != 5631 && var0 != 5633) {
			if (var0 == 5632) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 26;
				return 1;
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_stringStackSize -= 2;
			return 1;
		}
	}
}
