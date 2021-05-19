import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cu")
public class class80 {
	@ObfuscatedName("l")
	static final BigInteger field972;
	@ObfuscatedName("z")
	static final BigInteger field973;

	static {
		field972 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field973 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "-1294898247"
	)
	static int method1942(int var0, Script var1, boolean var2) {
		Widget var6;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == 1928) {
				var6 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class245.widgetDefaultMenuAction(var4, var6.id, var6.childIndex, var6.itemId, "");
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				WorldMapCacheName.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class245.widgetDefaultMenuAction(var5, var3, var4, DevicePcmPlayerProvider.getWidget(var3).itemId, "");
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field956 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var6 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
			} else {
				var6 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget;
			}

			if (var6.onResize == null) {
				return 0;
			} else {
				ScriptEvent var7 = new ScriptEvent();
				var7.widget = var6;
				var7.args = var6.onResize;
				var7.field1140 = Interpreter.field956 + 1;
				Client.scriptEvents.addFirst(var7);
				return 1;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "2078983117"
	)
	static int method1939(int var0, Script var1, boolean var2) {
		Widget var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 2615 && var0 != 2616) {
			return 2;
		} else {
			++WorldMapCacheName.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
	)
	static final void method1943() {
		PacketBufferNode var0 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2610, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class18.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			VerticalAlignment.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}
}
