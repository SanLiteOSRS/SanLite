import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("au")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;I)I",
		garbageValue = "-1255726150"
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
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "321566272"
	)
	static void method2866() {
		synchronized(ArchiveDiskActionHandler.field4259) { // L: 33
			if (ArchiveDiskActionHandler.field4257 == 0) { // L: 34
				class167.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 35
				class167.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 36
				class167.ArchiveDiskActionHandler_thread.start(); // L: 37
				class167.ArchiveDiskActionHandler_thread.setPriority(5); // L: 38
			}

			ArchiveDiskActionHandler.field4257 = 600; // L: 40
			ArchiveDiskActionHandler.field4261 = false; // L: 41
		}
	} // L: 43

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lto;II)V",
		garbageValue = "-32046829"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 72
		Players.Players_pendingUpdateCount = 0; // L: 73
		int var3 = 0; // L: 75
		var0.importIndex(); // L: 76

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 77
			var7 = Players.Players_indices[var4]; // L: 78
			if ((Players.field1387[var7] & 1) == 0) { // L: 79
				if (var3 > 0) { // L: 80
					--var3; // L: 81
					var10000 = Players.field1387; // L: 82
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1); // L: 85
					if (var6 == 0) { // L: 86
						var3 = class20.method305(var0); // L: 87
						var10000 = Players.field1387; // L: 88
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						AbstractArchive.readPlayerUpdate(var0, var7); // L: 91
					}
				}
			}
		}

		var0.exportIndex(); // L: 94
		if (var3 != 0) { // L: 95
			throw new RuntimeException(); // L: 96
		} else {
			var0.importIndex(); // L: 98

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 99
				var7 = Players.Players_indices[var4]; // L: 100
				if ((Players.field1387[var7] & 1) != 0) { // L: 101
					if (var3 > 0) { // L: 102
						--var3; // L: 103
						var10000 = Players.field1387; // L: 104
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1); // L: 107
						if (var6 == 0) { // L: 108
							var3 = class20.method305(var0); // L: 109
							var10000 = Players.field1387; // L: 110
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							AbstractArchive.readPlayerUpdate(var0, var7); // L: 113
						}
					}
				}
			}

			var0.exportIndex(); // L: 116
			if (var3 != 0) { // L: 117
				throw new RuntimeException();
			} else {
				var0.importIndex(); // L: 120

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 121
					var7 = Players.Players_emptyIndices[var4]; // L: 122
					if ((Players.field1387[var7] & 1) != 0) { // L: 123
						if (var3 > 0) { // L: 124
							--var3; // L: 125
							var10000 = Players.field1387; // L: 126
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1); // L: 129
							if (var6 == 0) { // L: 130
								var3 = class20.method305(var0); // L: 131
								var10000 = Players.field1387; // L: 132
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (KitDefinition.updateExternalPlayer(var0, var7)) { // L: 135
								var10000 = Players.field1387;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 138
				if (var3 != 0) { // L: 139
					throw new RuntimeException(); // L: 140
				} else {
					var0.importIndex(); // L: 142

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 143
						var7 = Players.Players_emptyIndices[var4]; // L: 144
						if ((Players.field1387[var7] & 1) == 0) { // L: 145
							if (var3 > 0) { // L: 146
								--var3; // L: 147
								var10000 = Players.field1387; // L: 148
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1); // L: 151
								if (var6 == 0) { // L: 152
									var3 = class20.method305(var0); // L: 153
									var10000 = Players.field1387; // L: 154
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (KitDefinition.updateExternalPlayer(var0, var7)) { // L: 157
									var10000 = Players.field1387;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 160
					if (var3 != 0) { // L: 161
						throw new RuntimeException(); // L: 162
					} else {
						Players.Players_count = 0; // L: 164
						Players.Players_emptyIdxCount = 0; // L: 165

						for (var4 = 1; var4 < 2048; ++var4) { // L: 166
							var10000 = Players.field1387; // L: 167
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4]; // L: 168
							if (var5 != null) { // L: 169
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 170
							}
						}

						class85.method2275(var0); // L: 173
						if (var0.offset - var2 != var1) { // L: 174
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 175
						}
					}
				}
			}
		}
	} // L: 177

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	static final void method2870(String var0) {
		MouseHandler.addGameMessage(30, "", var0); // L: 118
	} // L: 119

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-33"
	)
	static final int method2875(int var0) {
		return Math.min(Math.max(var0, 128), 383); // L: 3769
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-1798702842"
	)
	static final void method2874(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 10227
			if (Client.menuOptionsCount < 500) { // L: 10228
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10229
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10230
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10231
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10232
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10233
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10234
				Client.field680[Client.menuOptionsCount] = var6; // L: 10235
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 10236
				++Client.menuOptionsCount; // L: 10237
			}

		}
	} // L: 10239
}
