import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("l")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	public VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-871619448"
	)
	public void method4552(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4556(var1, var2);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "-359946158"
	)
	void method4556(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-159585156"
	)
	static int method4562(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return Script.method2355(var0, var1, var2);
		} else if (var0 < 1100) {
			return SpotAnimationDefinition.method4577(var0, var1, var2);
		} else if (var0 < 1200) {
			return KeyHandler.method934(var0, var1, var2);
		} else if (var0 < 1300) {
			return class69.method1266(var0, var1, var2);
		} else if (var0 < 1400) {
			return FriendSystem.method2018(var0, var1, var2);
		} else if (var0 < 1500) {
			return Language.method3802(var0, var1, var2);
		} else if (var0 < 1600) {
			return GrandExchangeOffer.method198(var0, var1, var2);
		} else if (var0 < 1700) {
			return ParamDefinition.method4671(var0, var1, var2);
		} else if (var0 < 1800) {
			return UserComparator4.method3506(var0, var1, var2);
		} else if (var0 < 1900) {
			return MouseHandler.method1152(var0, var1, var2);
		} else if (var0 < 2000) {
			return PlayerType.method4274(var0, var1, var2);
		} else if (var0 < 2100) {
			return SpotAnimationDefinition.method4577(var0, var1, var2);
		} else if (var0 < 2200) {
			return KeyHandler.method934(var0, var1, var2);
		} else if (var0 < 2300) {
			return class69.method1266(var0, var1, var2);
		} else if (var0 < 2400) {
			return FriendSystem.method2018(var0, var1, var2);
		} else if (var0 < 2500) {
			return Language.method3802(var0, var1, var2);
		} else if (var0 < 2600) {
			return Strings.method4259(var0, var1, var2);
		} else if (var0 < 2700) {
			return GrandExchangeEvent.method165(var0, var1, var2);
		} else if (var0 < 2800) {
			return class23.method249(var0, var1, var2);
		} else if (var0 < 2900) {
			return WorldMapID.method667(var0, var1, var2);
		} else if (var0 < 3000) {
			return PlayerType.method4274(var0, var1, var2);
		} else if (var0 < 3200) {
			return NPC.method2158(var0, var1, var2);
		} else if (var0 < 3300) {
			return WorldMapDecoration.method429(var0, var1, var2);
		} else if (var0 < 3400) {
			return VertexNormal.method3134(var0, var1, var2);
		} else if (var0 < 3500) {
			return Player.method1354(var0, var1, var2);
		} else if (var0 < 3700) {
			return SpriteMask.method4119(var0, var1, var2);
		} else if (var0 < 4000) {
			return class217.method4099(var0, var1, var2);
		} else if (var0 < 4100) {
			return PendingSpawn.method1840(var0, var1, var2);
		} else if (var0 < 4200) {
			return NetCache.method4461(var0, var1, var2);
		} else if (var0 < 4300) {
			return ModeWhere.method3806(var0, var1, var2);
		} else if (var0 < 5100) {
			return WorldMapSprite.method518(var0, var1, var2);
		} else if (var0 < 5400) {
			return Tiles.method1222(var0, var1, var2);
		} else if (var0 < 5600) {
			return class169.method3572(var0, var1, var2);
		} else if (var0 < 5700) {
			return WorldMapArea.method511(var0, var1, var2);
		} else if (var0 < 6300) {
			return class22.method244(var0, var1, var2);
		} else if (var0 < 6600) {
			return GrandExchangeOfferAgeComparator.method240(var0, var1, var2);
		} else {
			return var0 < 6700 ? MusicPatch.method4036(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lid;IIIBZI)V",
		garbageValue = "-1601672473"
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
		signature = "(III)I",
		garbageValue = "-2000095907"
	)
	static final int method4555(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
