import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public final class class13 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgv;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("u")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-53"
	)
	public static void method150() {
		WorldMapElement.WorldMapElement_cachedSprites.clear();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(Lfl;III)Ldh;",
		garbageValue = "474300455"
	)
	public static final PcmPlayer method146(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field1442 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class69.pcmPlayerProvider.player();
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field1441 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (FontName.field3694 > 0 && WorldMapDecoration.soundSystem == null) {
					WorldMapDecoration.soundSystem = new SoundSystem();
					RunException.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					RunException.soundSystemExecutor.scheduleAtFixedRate(WorldMapDecoration.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (WorldMapDecoration.soundSystem != null) {
					if (WorldMapDecoration.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					WorldMapDecoration.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		signature = "(Lcs;IB)V",
		garbageValue = "-27"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var11;
		if (var0.field1009 >= Client.cycle) {
			class236.method4265(var0);
		} else if (var0.field1024 >= Client.cycle) {
			WorldMapID.method666(var0);
		} else {
			var0.movementSequence = var0.readySequence;
			if (var0.pathLength == 0) {
				var0.field978 = 0;
			} else {
				label422: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) {
						var2 = class105.SequenceDefinition_get(var0.sequence);
						if (var0.field1034 > 0 && var2.field3549 == 0) {
							++var0.field978;
							break label422;
						}

						if (var0.field1034 <= 0 && var2.field3550 == 0) {
							++var0.field978;
							break label422;
						}
					}

					var11 = var0.x;
					int var12 = var0.y;
					int var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1011 * 64;
					int var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1011 * 64;
					if (var11 < var4) {
						if (var12 < var5) {
							var0.orientation = 1280;
						} else if (var12 > var5) {
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536;
						}
					} else if (var11 > var4) {
						if (var12 < var5) {
							var0.orientation = 768;
						} else if (var12 > var5) {
							var0.orientation = 256;
						} else {
							var0.orientation = 512;
						}
					} else if (var12 < var5) {
						var0.orientation = 1024;
					} else if (var12 > var5) {
						var0.orientation = 0;
					}

					byte var6 = var0.pathTraversed[var0.pathLength - 1];
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var12 <= 256 && var5 - var12 >= -256) {
						int var7 = var0.orientation - var0.rotation & 2047;
						if (var7 > 1024) {
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence;
						if (var7 >= -256 && var7 <= 256) {
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) {
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) {
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) {
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8;
						int var9 = 4;
						boolean var10 = true;
						if (var0 instanceof NPC) {
							var10 = ((NPC)var0).definition.isClickable;
						}

						if (var10) {
							if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1028 != 0) {
								var9 = 2;
							}

							if (var0.pathLength > 2) {
								var9 = 6;
							}

							if (var0.pathLength > 3) {
								var9 = 8;
							}

							if (var0.field978 > 0 && var0.pathLength > 1) {
								var9 = 8;
								--var0.field978;
							}
						} else {
							if (var0.pathLength > 1) {
								var9 = 6;
							}

							if (var0.pathLength > 2) {
								var9 = 8;
							}

							if (var0.field978 > 0 && var0.pathLength > 1) {
								var9 = 8;
								--var0.field978;
							}
						}

						if (var6 == 2) {
							var9 <<= 1;
						}

						if (var9 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
							var0.movementSequence = var0.runSequence;
						}

						if (var4 != var11 || var12 != var5) {
							if (var11 < var4) {
								var0.x += var9;
								if (var0.x > var4) {
									var0.x = var4;
								}
							} else if (var11 > var4) {
								var0.x -= var9;
								if (var0.x < var4) {
									var0.x = var4;
								}
							}

							if (var12 < var5) {
								var0.y += var9;
								if (var0.y > var5) {
									var0.y = var5;
								}
							} else if (var12 > var5) {
								var0.y -= var9;
								if (var0.y < var5) {
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) {
							--var0.pathLength;
							if (var0.field1034 > 0) {
								--var0.field1034;
							}
						}
					} else {
						var0.x = var4;
						var0.y = var5;
						--var0.pathLength;
						if (var0.field1034 > 0) {
							--var0.field1034;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1009 = 0;
			var0.field1024 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1011 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1011 * 64;
			var0.method1845();
		}

		if (PlayerType.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1009 = 0;
			var0.field1024 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1011 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1011 * 64;
			var0.method1845();
		}

		GameObject.method3415(var0);
		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			var2 = class105.SequenceDefinition_get(var0.movementSequence);
			if (var2 != null && var2.frameIds != null) {
				++var0.movementFrameCycle;
				if (var0.movementFrame < var2.frameIds.length && var0.movementFrameCycle > var2.frameLengths[var0.movementFrame]) {
					var0.movementFrameCycle = 1;
					++var0.movementFrame;
					UserComparator6.addSequenceSoundEffect(var2, var0.movementFrame, var0.x, var0.y);
				}

				if (var0.movementFrame >= var2.frameIds.length) {
					var0.movementFrameCycle = 0;
					var0.movementFrame = 0;
					UserComparator6.addSequenceSoundEffect(var2, var0.movementFrame, var0.x, var0.y);
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1015) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			var11 = HealthBarUpdate.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var11 != -1) {
				SequenceDefinition var3 = class105.SequenceDefinition_get(var11);
				if (var3 != null && var3.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var3.frameIds.length && var0.spotAnimationFrameCycle > var3.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						UserComparator6.addSequenceSoundEffect(var3, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if (var0.spotAnimationFrame >= var3.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3.frameIds.length)) {
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1;
				}
			} else {
				var0.spotAnimation = -1;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var2 = class105.SequenceDefinition_get(var0.sequence);
			if (var2.field3549 == 1 && var0.field1034 > 0 && var0.field1009 <= Client.cycle && var0.field1024 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var2 = class105.SequenceDefinition_get(var0.sequence);
			if (var2 != null && var2.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var2.frameIds.length && var0.sequenceFrameCycle > var2.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					UserComparator6.addSequenceSoundEffect(var2, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var2.frameIds.length) {
					var0.sequenceFrame -= var2.frameCount;
					++var0.field1022;
					if (var0.field1022 >= var2.field3547) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2.frameIds.length) {
						UserComparator6.addSequenceSoundEffect(var2, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var2.field3544;
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "966303255"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = GrandExchangeOfferWorldComparator.getTileHeight(var0, var1, GrandExchangeOfferUnitPriceComparator.Client_plane) - var2;
			var0 -= ItemContainer.cameraX;
			var3 -= ChatChannel.cameraY;
			var1 -= WorldMapManager.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[World.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[World.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[ViewportMouse.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[ViewportMouse.cameraYaw];
			int var8 = var0 * var7 + var6 * var1 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var3 * var4 + var5 * var1 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
