import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("d")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 894086561
	)
	static int field68;
	@ObfuscatedName("f")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 532460543
	)
	@Export("world")
	public int world;
	@ObfuscatedName("v")
	@Export("name")
	public String name;

	ClanChannelMember() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "109"
	)
	public static boolean method108(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field264[var0] : false;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-82"
	)
	static int method106(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator5.scriptDotWidget : Nameable.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) {
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANSTOP) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANSBOT) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLMODE) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 1615 && var0 != 1616) {
			return 2;
		} else {
			++ChatChannel.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1449635210"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = InterfaceParent.getPacketBufferNode(ClientPacket.field2662, Client.packetWriter.isaacCipher);
		var2.packetBuffer.method6648(var1);
		var2.packetBuffer.writeIntME(var0);
		Client.packetWriter.addNode(var2);
	}
}
