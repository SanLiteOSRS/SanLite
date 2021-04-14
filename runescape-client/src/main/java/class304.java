import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public final class class304 {
	@ObfuscatedName("f")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("o")
	static long[] field3761;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field3761 = new long[12];

		for (int var0 = 0; var0 < field3761.length; ++var0) {
			field3761[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1745033175"
	)
	static void method5536() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		Language.mouseRecorder.index = 0;
		GrandExchangeOfferAgeComparator.hasFocus = true;
		Client.hadFocus = true;
		Client.field678 = -1L;
		class69.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1381 = null;
		Client.packetWriter.field1392 = null;
		Client.packetWriter.field1393 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1391 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		MouseHandler.MouseHandler_idleCycles = 0;
		Script.method2010();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class105.field1331 = null;
		Client.minimapState = 0;
		Client.field833 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		TaskHandler.method2524();

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) {
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1;
		Client.projectiles.clear();
		Client.graphicsObjects.clear();

		for (var0 = 0; var0 < 4; ++var0) {
			for (int var1 = 0; var1 < 104; ++var1) {
				for (int var2 = 0; var2 < 104; ++var2) {
					Client.groundItems[var0][var1][var2] = null;
				}
			}
		}

		Client.pendingSpawns = new NodeDeque();
		class13.friendSystem.clear();

		for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) {
			VarpDefinition var3 = class303.VarpDefinition_get(var0);
			if (var3 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		TextureProvider.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			WorldMapRegion.method2929(Client.rootInterface);
		}

		for (InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.first(); var4 != null; var4 = (InterfaceParent)Client.interfaceParents.next()) {
			WorldMapData_1.closeInterface(var4, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field811[var0] = true;
		}

		ItemContainer.method2093();
		InterfaceParent.clanChat = null;
		ObjectSound.field928 = null;
		Arrays.fill(Client.field831, (Object)null);
		IsaacCipher.field4266 = null;
		Arrays.fill(Client.field820, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		Calendar.grandExchangeEvents = null;
	}
}
