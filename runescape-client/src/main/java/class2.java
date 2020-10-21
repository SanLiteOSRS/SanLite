import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
final class class2 implements class0 {
	@ObfuscatedName("ak")
	@Export("client")
	@ObfuscatedSignature(
		signature = "Lclient;"
	)
	static Client client;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;Lkf;B)V",
		garbageValue = "21"
	)
	public void vmethod70(Object var1, Buffer var2) {
		this.method25((Long)var1, var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkf;I)Ljava/lang/Object;",
		garbageValue = "-453860591"
	)
	public Object vmethod61(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Long;Lkf;B)V",
		garbageValue = "-94"
	)
	void method25(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([BB)Ljava/lang/String;",
		garbageValue = "36"
	)
	public static String method40(byte[] var0) {
		return PlayerComposition.method4116(var0, 0, var0.length);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;ZI)Lmy;",
		garbageValue = "-65308195"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (SoundSystem.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (SoundSystem.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(UserComparator2.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lky;IB)V",
		garbageValue = "0"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();

		byte[] var10000;
		int var4;
		int var5;
		int var6;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var5 = Players.Players_indices[var4];
			if ((Players.field1285[var5] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1285;
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = Tiles.method1186(var0);
						var10000 = Players.field1285;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						class225.readPlayerUpdate(var0, var5);
					}
				}
			}
		}

		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var5 = Players.Players_indices[var4];
				if ((Players.field1285[var5] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1285;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = Tiles.method1186(var0);
							var10000 = Players.field1285;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							class225.readPlayerUpdate(var0, var5);
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var5 = Players.Players_emptyIndices[var4];
					if ((Players.field1285[var5] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1285;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = Tiles.method1186(var0);
								var10000 = Players.field1285;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (FileSystem.updateExternalPlayer(var0, var5)) {
								var10000 = Players.field1285;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var5 = Players.Players_emptyIndices[var4];
						if ((Players.field1285[var5] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1285;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = Tiles.method1186(var0);
									var10000 = Players.field1285;
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (FileSystem.updateExternalPlayer(var0, var5)) {
									var10000 = Players.field1285;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1285;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var7 = Client.players[var4];
							if (var7 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						GrandExchangeOfferAgeComparator.method234(var0);
						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1849126177"
	)
	public static void method41() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Lct;Lct;IZI)I",
		garbageValue = "-1471350049"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1823() ? (var1.method1823() ? 0 : 1) : (var1.method1823() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1821() ? (var1.method1821() ? 0 : 1) : (var1.method1821() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IZII)V",
		garbageValue = "94812799"
	)
	public static final void method37(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			PcmPlayer.field1447 = var0;
			PcmPlayer.PcmPlayer_stereo = var1;
			Decimator.field1491 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		signature = "(Lcf;III)V",
		garbageValue = "-1026866669"
	)
	static final void method39(MenuAction var0, int var1, int var2) {
		SecureRandomCallable.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.action, var0.action, var1, var2);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-22039586"
	)
	static void method24() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) {
			if (LoginScreenAnimation.method1905(Client.menuOpcodes[var0])) {
				if (var0 < Client.menuOptionsCount - 1) {
					for (int var1 = var0; var1 < Client.menuOptionsCount - 1; ++var1) {
						Client.menuActions[var1] = Client.menuActions[var1 + 1];
						Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
						Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
						Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
						Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
						Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
						Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
					}
				}

				--var0;
				--Client.menuOptionsCount;
			}
		}

		GrandExchangeOfferTotalQuantityComparator.method164();
	}
}
