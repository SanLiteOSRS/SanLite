import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("du")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 929025169
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("gz")
	static String field1371;
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;I)I",
		garbageValue = "-599692385"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILqr;I)Lfx;",
		garbageValue = "1791266795"
	)
	public static class167 method2551(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class167 var5 = new class167(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1790 != null && var7.length == var5.field1790.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1790[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1791 != null && var7.length == var5.field1791.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1791[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "370922234"
	)
	static final void method2552(String var0) {
		class4.method20("Please remove " + var0 + " from your friend list first"); // L: 164
	} // L: 165

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1829428973"
	)
	static int method2553(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1421
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1422
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.itemId; // L: 1423
			return 1; // L: 1424
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1426
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1427
			if (var3.itemId != -1) { // L: 1428
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1429
			}

			return 1; // L: 1430
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1432
			int var5 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1433
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1434
			if (var4 != null) { // L: 1435
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 1436
			}

			return 1; // L: 1437
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1439
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1440
			return 1; // L: 1441
		} else if (var0 == 2707) { // L: 1443
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1444
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.method5562() ? 1 : 0; // L: 1445
			return 1; // L: 1446
		} else if (var0 == 2708) { // L: 1448
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1449
			return class154.method3103(var3); // L: 1450
		} else if (var0 == 2709) { // L: 1452
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1453
			return AttackOption.method2360(var3); // L: 1454
		} else {
			return 2; // L: 1456
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-607876153"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2818
		class116.method2678(); // L: 2819
		class12.scene.clear(); // L: 2820

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2821
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 2822
		class273.musicPlayerStatus = 1; // L: 2824
		NetFileRequest.musicTrackArchive = null; // L: 2825
		UrlRequester.musicTrackGroupId = -1; // L: 2826
		SceneTilePaint.musicTrackFileId = -1; // L: 2827
		class28.musicTrackVolume = 0; // L: 2828
		class273.musicTrackBoolean = false; // L: 2829
		class160.pcmSampleLength = 2; // L: 2830
		Client.currentTrackGroupId = -1; // L: 2832
		Client.playingJingle = false; // L: 2833
		class83.method2085(); // L: 2834
		class4.updateGameState(10); // L: 2835
	} // L: 2836

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1059665614"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 10764
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "653733105"
	)
	static final void method2554(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12040
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3046()) { // L: 12041
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12042
				if (var2.rank == -1) { // L: 12043
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2947, Client.packetWriter.isaacCipher); // L: 12044
					var3.packetBuffer.writeByte(3 + class309.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12045
					var3.packetBuffer.writeByte(var0); // L: 12046
					var3.packetBuffer.writeShort(var1); // L: 12047
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12048
					Client.packetWriter.addNode(var3); // L: 12049
				}
			}
		}
	} // L: 12050
}
