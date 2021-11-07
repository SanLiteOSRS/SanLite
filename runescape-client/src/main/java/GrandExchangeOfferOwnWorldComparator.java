import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("i")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;I)I",
		garbageValue = "1561546631"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-90"
	)
	public static int method1162(int var0, int var1, int var2) {
		int var3 = class123.method2619(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "69"
	)
	static int method1158(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class14.Interpreter_intStackSize -= 2;
			Client.field464 = (short)class9.method83(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]);
			if (Client.field464 <= 0) {
				Client.field464 = 256;
			}

			Client.field550 = (short)class9.method83(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]);
			if (Client.field550 <= 0) {
				Client.field550 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class14.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class14.Interpreter_intStackSize -= 4;
			Client.field727 = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
			if (Client.field727 <= 0) {
				Client.field727 = 1;
			}

			Client.field600 = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
			if (Client.field600 <= 0) {
				Client.field600 = 32767;
			} else if (Client.field600 < Client.field727) {
				Client.field600 = Client.field727;
			}

			Client.field729 = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
			if (Client.field729 <= 0) {
				Client.field729 = 1;
			}

			Client.field730 = (short)Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 3];
			if (Client.field730 <= 0) {
				Client.field730 = 32767;
			} else if (Client.field730 < Client.field729) {
				Client.field730 = Client.field729;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				SpriteMask.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = MouseHandler.method626(Client.field464);
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = MouseHandler.method626(Client.field550);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = KeyHandler.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2002863284"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2758, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
