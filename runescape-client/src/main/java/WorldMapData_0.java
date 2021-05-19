import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "0"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2099.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 64;
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			super.groupId = var1.method6464();
			super.fileId = var1.method6464();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "1915938242"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2063 = new byte[super.planes][64][64];
		super.field2064 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class179.field2097.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY) {
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false;
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1;
			return var2.regionX == super.regionX && super.regionY == var2.regionY;
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lcw;I)V",
		garbageValue = "-1306171247"
	)
	static final void method3145(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = class5.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = class5.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = class5.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class5.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) {
			int var6 = class5.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = class6.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1203 = var4;
		var0.field1199 = var5;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1784576857"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		Script.method2014();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var3 = MusicPatchNode.VarpDefinition_get(var0).type;
		if (var3 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var3 == 1) {
				if (var2 == 1) {
					class264.method4796(0.9D);
				}

				if (var2 == 2) {
					class264.method4796(0.8D);
				}

				if (var2 == 3) {
					class264.method4796(0.7D);
				}

				if (var2 == 4) {
					class264.method4796(0.6D);
				}
			}

			if (var3 == 3) {
				if (var2 == 0) {
					class23.method306(255);
				}

				if (var2 == 1) {
					class23.method306(192);
				}

				if (var2 == 2) {
					class23.method306(128);
				}

				if (var2 == 3) {
					class23.method306(64);
				}

				if (var2 == 4) {
					class23.method306(0);
				}
			}

			if (var3 == 4) {
				if (var2 == 0) {
					class20.updateSoundEffectVolume(127);
				}

				if (var2 == 1) {
					class20.updateSoundEffectVolume(96);
				}

				if (var2 == 2) {
					class20.updateSoundEffectVolume(64);
				}

				if (var2 == 3) {
					class20.updateSoundEffectVolume(32);
				}

				if (var2 == 4) {
					class20.updateSoundEffectVolume(0);
				}
			}

			if (var3 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var3 == 6) {
				Client.chatEffects = var2;
			}

			if (var3 == 9) {
				Client.field781 = var2;
			}

			if (var3 == 10) {
				if (var2 == 0) {
					Occluder.method4088(127);
				}

				if (var2 == 1) {
					Occluder.method4088(96);
				}

				if (var2 == 2) {
					Occluder.method4088(64);
				}

				if (var2 == 3) {
					Occluder.method4088(32);
				}

				if (var2 == 4) {
					Occluder.method4088(0);
				}
			}

			if (var3 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var3 == 18) {
				Client.playerAttackOption = (AttackOption)UserComparator4.findEnumerated(Renderable.method4080(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var3 == 22) {
				Client.npcAttackOption = (AttackOption)UserComparator4.findEnumerated(Renderable.method4080(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
