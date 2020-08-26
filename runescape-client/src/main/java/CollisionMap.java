import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 232599941
	)
	@Export("xInset")
	int xInset;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2100158867
	)
	@Export("yInset")
	int yInset;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -393101507
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2096335191
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("aq")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0;
		this.yInset = 0;
		this.xSize = var1;
		this.ySize = var2;
		this.flags = new int[this.xSize][this.ySize];
		this.clear();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1749898511"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) {
			for (int var2 = 0; var2 < this.ySize; ++var2) {
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
					this.flags[var1][var2] = 16777216;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IIIIZI)V",
		garbageValue = "580618753"
	)
	public void method3630(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 128);
				this.setFlag(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 2);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 8);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 32);
				this.setFlag(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 1);
				this.setFlag(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 4);
				this.setFlag(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 16);
				this.setFlag(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 64);
				this.setFlag(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 130);
				this.setFlag(var1 - 1, var2, 8);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 10);
				this.setFlag(var1, var2 + 1, 32);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 40);
				this.setFlag(var1 + 1, var2, 128);
				this.setFlag(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 160);
				this.setFlag(var1, var2 - 1, 2);
				this.setFlag(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 65536);
					this.setFlag(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 1024);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 4096);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 16384);
					this.setFlag(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 512);
					this.setFlag(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 2048);
					this.setFlag(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 8192);
					this.setFlag(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 32768);
					this.setFlag(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 66560);
					this.setFlag(var1 - 1, var2, 4096);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 5120);
					this.setFlag(var1, var2 + 1, 16384);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 20480);
					this.setFlag(var1 + 1, var2, 65536);
					this.setFlag(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 81920);
					this.setFlag(var1, var2 - 1, 1024);
					this.setFlag(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(IIIIZI)V",
		garbageValue = "-1934730516"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256;
		if (var5) {
			var6 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;

		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			if (var7 >= 0 && var7 < this.xSize) {
				for (int var8 = var2; var8 < var2 + var4; ++var8) {
					if (var8 >= 0 && var8 < this.ySize) {
						this.setFlag(var7, var8, var6);
					}
				}
			}
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1924690823"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 2097152;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1474053794"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 262144;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "88"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] |= var3;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IIIIZI)V",
		garbageValue = "1610140342"
	)
	public void method3635(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 128);
				this.setFlagOff(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 2);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 8);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 32);
				this.setFlagOff(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 1);
				this.setFlagOff(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 4);
				this.setFlagOff(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 16);
				this.setFlagOff(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 64);
				this.setFlagOff(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 130);
				this.setFlagOff(var1 - 1, var2, 8);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 10);
				this.setFlagOff(var1, var2 + 1, 32);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 40);
				this.setFlagOff(var1 + 1, var2, 128);
				this.setFlagOff(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 160);
				this.setFlagOff(var1, var2 - 1, 2);
				this.setFlagOff(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 65536);
					this.setFlagOff(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 1024);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 4096);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 16384);
					this.setFlagOff(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 512);
					this.setFlagOff(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 2048);
					this.setFlagOff(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 8192);
					this.setFlagOff(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 32768);
					this.setFlagOff(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 66560);
					this.setFlagOff(var1 - 1, var2, 4096);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 5120);
					this.setFlagOff(var1, var2 + 1, 16384);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 20480);
					this.setFlagOff(var1 + 1, var2, 65536);
					this.setFlagOff(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 81920);
					this.setFlagOff(var1, var2 - 1, 1024);
					this.setFlagOff(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(IIIIIZI)V",
		garbageValue = "65280"
	)
	@Export("setFlagOffNonSquare")
	public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;
		int var8;
		if (var5 == 1 || var5 == 3) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < this.xSize) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.ySize) {
						this.setFlagOff(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "-1445892610"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] &= ~var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "794579216"
	)
	public void method3638(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] &= -262145;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1810709507"
	)
	public static void method3653() {
		ParamDefinition.ParamDefinition_cached.clear();
	}

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1831550493"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				class2.client.method1002();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				Client.loginState = 0;
				Client.field822 = 0;
				Client.field708 = 0;
				Client.timer.method5110(var0);
				if (var0 != 20) {
					class22.method245(false);
				}
			}

			if (var0 != 20 && var0 != 40 && MouseHandler.field508 != null) {
				MouseHandler.field508.close();
				MouseHandler.field508 = null;
			}

			if (Client.gameState == 25) {
				Client.field732 = 0;
				Client.field728 = 0;
				Client.field711 = 1;
				Client.field895 = 0;
				Client.field791 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					UserComparator1.method6041(Occluder.archive10, Huffman.archive8, true, Client.gameState == 11 ? 4 : 0);
				} else if (var0 == 11) {
					UserComparator1.method6041(Occluder.archive10, Huffman.archive8, false, 4);
				} else {
					Strings.method4202();
				}
			} else {
				UserComparator1.method6041(Occluder.archive10, Huffman.archive8, true, 0);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		signature = "(Lcg;II)V",
		garbageValue = "1018652463"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		SequenceDefinition var11;
		if (var0.field1026 >= Client.cycle) {
			Coord.method4084(var0);
		} else {
			int var5;
			int var7;
			if (var0.field1019 >= Client.cycle) {
				if (var0.field1019 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > WorldMapRegion.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
					var2 = var0.field1019 - var0.field1026;
					var3 = Client.cycle - var0.field1026;
					var4 = var0.field997 * 128 + var0.field1014 * 64;
					var5 = var0.field1016 * 128 + var0.field1014 * 64;
					int var6 = var0.field1015 * 128 + var0.field1014 * 64;
					var7 = var0.field1017 * 128 + var0.field1014 * 64;
					var0.x = (var3 * var6 + var4 * (var2 - var3)) / var2;
					var0.y = (var3 * var7 + var5 * (var2 - var3)) / var2;
				}

				var0.field1032 = 0;
				var0.orientation = var0.field1027;
				var0.rotation = var0.orientation;
			} else {
				var0.movementSequence = var0.readySequence;
				if (var0.pathLength == 0) {
					var0.field1032 = 0;
				} else {
					label577: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) {
							var11 = WorldMapRegion.SequenceDefinition_get(var0.sequence);
							if (var0.field973 > 0 && var11.field3549 == 0) {
								++var0.field1032;
								break label577;
							}

							if (var0.field973 <= 0 && var11.field3541 == 0) {
								++var0.field1032;
								break label577;
							}
						}

						var2 = var0.x;
						var3 = var0.y;
						var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1014 * 64;
						var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1014 * 64;
						if (var2 < var4) {
							if (var3 < var5) {
								var0.orientation = 1280;
							} else if (var3 > var5) {
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536;
							}
						} else if (var2 > var4) {
							if (var3 < var5) {
								var0.orientation = 768;
							} else if (var3 > var5) {
								var0.orientation = 256;
							} else {
								var0.orientation = 512;
							}
						} else if (var3 < var5) {
							var0.orientation = 1024;
						} else if (var3 > var5) {
							var0.orientation = 0;
						}

						byte var14 = var0.pathTraversed[var0.pathLength - 1];
						if (var4 - var2 <= 256 && var4 - var2 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
							var7 = var0.orientation - var0.rotation & 2047;
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
								if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1025 != 0) {
									var9 = 2;
								}

								if (var0.pathLength > 2) {
									var9 = 6;
								}

								if (var0.pathLength > 3) {
									var9 = 8;
								}

								if (var0.field1032 > 0 && var0.pathLength > 1) {
									var9 = 8;
									--var0.field1032;
								}
							} else {
								if (var0.pathLength > 1) {
									var9 = 6;
								}

								if (var0.pathLength > 2) {
									var9 = 8;
								}

								if (var0.field1032 > 0 && var0.pathLength > 1) {
									var9 = 8;
									--var0.field1032;
								}
							}

							if (var14 == 2) {
								var9 <<= 1;
							}

							if (var9 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) {
								var0.movementSequence = var0.runSequence;
							}

							if (var4 != var2 || var5 != var3) {
								if (var2 < var4) {
									var0.x += var9;
									if (var0.x > var4) {
										var0.x = var4;
									}
								} else if (var2 > var4) {
									var0.x -= var9;
									if (var0.x < var4) {
										var0.x = var4;
									}
								}

								if (var3 < var5) {
									var0.y += var9;
									if (var0.y > var5) {
										var0.y = var5;
									}
								} else if (var3 > var5) {
									var0.y -= var9;
									if (var0.y < var5) {
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) {
								--var0.pathLength;
								if (var0.field973 > 0) {
									--var0.field973;
								}
							}
						} else {
							var0.x = var4;
							var0.y = var5;
							--var0.pathLength;
							if (var0.field973 > 0) {
								--var0.field973;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1026 = 0;
			var0.field1019 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1014 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1014 * 64;
			var0.method1797();
		}

		if (WorldMapLabelSize.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1026 = 0;
			var0.field1019 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1014 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1014 * 64;
			var0.method1797();
		}

		if (var0.field1025 != 0) {
			if (var0.targetIndex != -1) {
				Object var15 = null;
				if (var0.targetIndex < 32768) {
					var15 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var15 = Client.players[var0.targetIndex - 32768];
				}

				if (var15 != null) {
					var3 = var0.x - ((Actor)var15).x;
					var4 = var0.y - ((Actor)var15).y;
					if (var3 != 0 || var4 != 0) {
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field1000 != -1 && (var0.pathLength == 0 || var0.field1032 > 0)) {
				var0.orientation = var0.field1000;
				var0.field1000 = -1;
			}

			var2 = var0.orientation - var0.rotation & 2047;
			if (var2 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var2 != 0) {
				++var0.field1024;
				boolean var13;
				if (var2 > 1024) {
					var0.rotation -= var0.field1025;
					var13 = true;
					if (var2 < var0.field1025 || var2 > 2048 - var0.field1025) {
						var0.rotation = var0.orientation;
						var13 = false;
					}

					if (var0.movementSequence == var0.readySequence && (var0.field1024 > 25 || var13)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1025;
					var13 = true;
					if (var2 < var0.field1025 || var2 > 2048 - var0.field1025) {
						var0.rotation = var0.orientation;
						var13 = false;
					}

					if (var0.readySequence == var0.movementSequence && (var0.field1024 > 25 || var13)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field1024 = 0;
			}
		}

		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			var11 = WorldMapRegion.SequenceDefinition_get(var0.movementSequence);
			if (var11 != null && var11.frameIds != null) {
				++var0.movementFrameCycle;
				if (var0.movementFrame < var11.frameIds.length && var0.movementFrameCycle > var11.frameLengths[var0.movementFrame]) {
					var0.movementFrameCycle = 1;
					++var0.movementFrame;
					GrandExchangeEvent.addSequenceSoundEffect(var11, var0.movementFrame, var0.x, var0.y);
				}

				if (var0.movementFrame >= var11.frameIds.length) {
					var0.movementFrameCycle = 0;
					var0.movementFrame = 0;
					GrandExchangeEvent.addSequenceSoundEffect(var11, var0.movementFrame, var0.x, var0.y);
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1013) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			var2 = Tiles.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var2 != -1) {
				SequenceDefinition var12 = WorldMapRegion.SequenceDefinition_get(var2);
				if (var12 != null && var12.frameIds != null) {
					++var0.spotAnimationFrameCycle;
					if (var0.spotAnimationFrame < var12.frameIds.length && var0.spotAnimationFrameCycle > var12.frameLengths[var0.spotAnimationFrame]) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						GrandExchangeEvent.addSequenceSoundEffect(var12, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if (var0.spotAnimationFrame >= var12.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var12.frameIds.length)) {
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
			var11 = WorldMapRegion.SequenceDefinition_get(var0.sequence);
			if (var11.field3549 == 1 && var0.field973 > 0 && var0.field1026 <= Client.cycle && var0.field1019 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var11 = WorldMapRegion.SequenceDefinition_get(var0.sequence);
			if (var11 != null && var11.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var11.frameIds.length && var0.sequenceFrameCycle > var11.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					GrandExchangeEvent.addSequenceSoundEffect(var11, var0.sequenceFrame, var0.x, var0.y);
				}

				if (var0.sequenceFrame >= var11.frameIds.length) {
					var0.sequenceFrame -= var11.frameCount;
					++var0.field1009;
					if (var0.field1009 >= var11.field3548) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var11.frameIds.length) {
						GrandExchangeEvent.addSequenceSoundEffect(var11, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var11.field3544;
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-1510761090"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1014 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = class227.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					ScriptEvent.scene.drawEntity(Huffman.Client_plane, var2.x, var2.y, ArchiveLoader.getTileHeight(var2.field1014 * 64 - 64 + var2.x, var2.field1014 * 64 - 64 + var2.y, Huffman.Client_plane), var2.field1014 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}
}
