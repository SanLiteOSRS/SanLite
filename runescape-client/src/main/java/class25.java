import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class25 extends class16 {
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("clanChat")
	static FriendsChatManager clanChat;
	@ObfuscatedName("cq")
	public static char field207;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1205001631
	)
	int field213;
	@ObfuscatedName("c")
	byte field203;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 523989251
	)
	int field202;
	@ObfuscatedName("g")
	String field215;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lm;)V"
	)
	class25(class19 var1) {
		this.this$0 = var1;
		this.field213 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;S)V",
		garbageValue = "4095"
	)
	void vmethod326(Buffer var1) {
		var1.readUnsignedByte();
		this.field213 = var1.readUnsignedShort();
		this.field203 = var1.readByte();
		this.field202 = var1.readUnsignedShort();
		var1.readLong();
		this.field215 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;B)V",
		garbageValue = "-61"
	)
	void vmethod314(class3 var1) {
		class9 var2 = (class9)var1.field32.get(this.field213);
		var2.field76 = this.field203;
		var2.field80 = this.field202;
		var2.field73 = this.field215;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1703342087"
	)
	public static int method313(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 <= 127) {
				++var2;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}

		return var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lji;IIIBZS)V",
		garbageValue = "-16702"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2);
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6);
		if (var8 == null) {
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6);
			if (var8 == null) {
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6);
				if (var8 != null) {
					if (var5) {
						var8.removeDual();
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingPriorityWritesCount;
					}

				} else {
					if (!var5) {
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6);
						if (var8 != null) {
							return;
						}
					}

					var8 = new NetFileRequest();
					var8.archive = var0;
					var8.crc = var3;
					var8.padding = var4;
					if (var5) {
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						++NetCache.NetCache_pendingPriorityWritesCount;
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8);
						NetCache.NetCache_pendingWrites.put(var8, var6);
						++NetCache.NetCache_pendingWritesCount;
					}

				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BI)Lci;",
		garbageValue = "1537198206"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? MouseRecorder.method2126(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field1054 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "599751075"
	)
	static String method316() {
		return class12.clientPreferences.hideUsername ? SecureRandomCallable.method2081(Login.Login_username) : Login.Login_username;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "644141113"
	)
	static void method321() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		class69.mouseRecorder.index = 0;
		class124.hasFocus = true;
		Client.hadFocus = true;
		Client.field799 = -1L;
		class12.method203();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1386 = null;
		Client.packetWriter.field1387 = null;
		Client.packetWriter.field1391 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1384 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Occluder.method4090();
		MouseHandler.MouseHandler_idleCycles = 0;
		AttackOption.method2286();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class18.field154 = null;
		Client.minimapState = 0;
		Client.field848 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		Projectile.method1996();

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
			for (int var4 = 0; var4 < 104; ++var4) {
				for (int var2 = 0; var2 < 104; ++var2) {
					Client.groundItems[var0][var4][var2] = null;
				}
			}
		}

		Client.pendingSpawns = new NodeDeque();
		GrandExchangeOfferUnitPriceComparator.friendSystem.clear();

		for (var0 = 0; var0 < class403.VarpDefinition_fileCount; ++var0) {
			VarpDefinition var1 = MusicPatchNode.VarpDefinition_get(var0);
			if (var1 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		Client.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			WallDecoration.method4234(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) {
			class18.closeInterface(var3, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Occluder.method4090();
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		class285.method5055();
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field825[var0] = true;
		}

		PacketBufferNode var5 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2655, Client.packetWriter.isaacCipher);
		var5.packetBuffer.writeByte(HitSplatDefinition.getWindowedMode());
		var5.packetBuffer.writeShort(GameEngine.canvasWidth);
		var5.packetBuffer.writeShort(HealthBarDefinition.canvasHeight);
		Client.packetWriter.addNode(var5);
		clanChat = null;
		class105.field1328 = null;
		Arrays.fill(Client.field678, (Object)null);
		Players.field1358 = null;
		Arrays.fill(Client.field847, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class29.grandExchangeEvents = null;
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1545590889"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		FileSystem.logOut();
		switch(var0) {
		case 1:
			FontName.method6157();
			break;
		case 2:
			class26.method334();
		}

	}
}
