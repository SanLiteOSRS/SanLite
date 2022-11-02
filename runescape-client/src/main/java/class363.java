import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class363 extends AbstractQueue {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lms;"
	)
	class361[] field4325;
	@ObfuscatedName("f")
	Map field4320;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 333369771
	)
	int field4322;
	@ObfuscatedName("x")
	final Comparator field4323;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1357069319
	)
	int field4324;

	public class363(int var1, Comparator var2) {
		this.field4324 = 0; // L: 10
		this.field4325 = new class361[var1]; // L: 17
		this.field4320 = new HashMap(); // L: 18
		this.field4323 = var2; // L: 19
	} // L: 20

	public class363(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1439807432"
	)
	void method6848() {
		int var1 = (this.field4325.length << 1) + 1; // L: 23
		this.field4325 = (class361[])((class361[])Arrays.copyOf(this.field4325, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2040074955"
	)
	void method6854(int var1) {
		class361 var2;
		int var3;
		for (var2 = this.field4325[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class361 var4 = this.field4325[var3]; // L: 99
			if (this.field4323 != null) { // L: 100
				if (this.field4323.compare(var2.field4310, var4.field4310) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4310).compareTo(var4.field4310) >= 0) { // L: 104
				break;
			}

			this.field4325[var1] = var4; // L: 106
			this.field4325[var1].field4311 = var1; // L: 107
		}

		this.field4325[var1] = var2; // L: 110
		this.field4325[var1].field4311 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1431717548"
	)
	void method6850(int var1) {
		class361 var2 = this.field4325[var1]; // L: 116

		int var8;
		for (int var3 = this.field4322 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class361 var5 = this.field4325[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class361 var7 = this.field4325[var6]; // L: 122
			if (this.field4323 != null) { // L: 124
				if (var6 < this.field4322 && this.field4323.compare(var5.field4310, var7.field4310) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4322 && ((Comparable)var5.field4310).compareTo(var7.field4310) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4323 != null) { // L: 132
				if (this.field4323.compare(var2.field4310, this.field4325[var8].field4310) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4310).compareTo(this.field4325[var8].field4310) <= 0) { // L: 136
				break;
			}

			this.field4325[var1] = this.field4325[var8]; // L: 138
			this.field4325[var1].field4311 = var1; // L: 139
		}

		this.field4325[var1] = var2; // L: 142
		this.field4325[var1].field4311 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class361 var2 = (class361)this.field4320.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4324; // L: 79
			--this.field4322; // L: 80
			if (var2.field4311 == this.field4322) { // L: 81
				this.field4325[this.field4322] = null; // L: 82
				return true; // L: 83
			} else {
				class361 var3 = this.field4325[this.field4322]; // L: 85
				this.field4325[this.field4322] = null; // L: 86
				this.field4325[var2.field4311] = var3; // L: 87
				this.field4325[var2.field4311].field4311 = var2.field4311; // L: 88
				this.method6850(var2.field4311); // L: 89
				if (var3 == this.field4325[var2.field4311]) { // L: 90
					this.method6854(var2.field4311);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4322 == 0 ? null : this.field4325[0].field4310; // L: 54 55
	}

	public int size() {
		return this.field4322; // L: 29
	}

	public boolean offer(Object var1) {
		if (this.field4320.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4324; // L: 35
			int var2 = this.field4322; // L: 36
			if (var2 >= this.field4325.length) { // L: 37
				this.method6848();
			}

			++this.field4322; // L: 38
			if (var2 == 0) { // L: 39
				this.field4325[0] = new class361(var1, 0); // L: 40
				this.field4320.put(var1, this.field4325[0]); // L: 41
			} else {
				this.field4325[var2] = new class361(var1, var2); // L: 44
				this.field4320.put(var1, this.field4325[var2]); // L: 45
				this.method6854(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public Object poll() {
		if (this.field4322 == 0) { // L: 61
			return null;
		} else {
			++this.field4324; // L: 62
			Object var1 = this.field4325[0].field4310; // L: 63
			this.field4320.remove(var1); // L: 64
			--this.field4322; // L: 65
			if (this.field4322 == 0) {
				this.field4325[this.field4322] = null; // L: 66
			} else {
				this.field4325[0] = this.field4325[this.field4322]; // L: 68
				this.field4325[0].field4311 = 0; // L: 69
				this.field4325[this.field4322] = null; // L: 70
				this.method6850(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean contains(Object var1) {
		return this.field4320.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4323 != null) {
			Arrays.sort(var1, this.field4323); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class362(this); // L: 162
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ljk;I)V",
		garbageValue = "-1489380866"
	)
	static final void method6873(class273 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7674
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		byte var12;
		int var14;
		Projectile var35;
		int var40;
		int var41;
		int var42;
		if (class273.field3112 == var0) { // L: 7675
			var2 = var1.method8484(); // L: 7676
			var3 = var1.method8435() * 4; // L: 7677
			byte var38 = var1.readByte(); // L: 7678
			var5 = var1.method8444(); // L: 7679
			var6 = var1.method8436(); // L: 7680
			var7 = var1.method8435(); // L: 7681
			var8 = var1.method8438(); // L: 7682
			var9 = var1.readUnsignedByte(); // L: 7683
			var10 = (var9 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7684
			var40 = (var9 & 7) + class11.field64; // L: 7685
			var12 = var1.method8469(); // L: 7686
			var42 = var1.method8623() * 4; // L: 7687
			var14 = var1.method8444(); // L: 7688
			var4 = var38 + var10; // L: 7689
			var41 = var12 + var40; // L: 7690
			if (var10 >= 0 && var40 >= 0 && var10 < 104 && var40 < 104 && var4 >= 0 && var41 >= 0 && var4 < 104 && var41 < 104 && var5 != 65535) { // L: 7691
				var10 = var10 * 128 + 64; // L: 7692
				var40 = var40 * 128 + 64; // L: 7693
				var4 = var4 * 128 + 64; // L: 7694
				var41 = var41 * 128 + 64; // L: 7695
				var35 = new Projectile(var5, ApproximateRouteStrategy.Client_plane, var10, var40, class132.getTileHeight(var10, var40, ApproximateRouteStrategy.Client_plane) - var42, var2 + Client.cycle, var14 + Client.cycle, var6, var7, var8, var3); // L: 7696
				var35.setDestination(var4, var41, class132.getTileHeight(var4, var41, ApproximateRouteStrategy.Client_plane) - var3, var2 + Client.cycle); // L: 7697
				Client.projectiles.addFirst(var35); // L: 7698
			}

		} else {
			if (class273.field3109 == var0) { // L: 7702
				var2 = var1.method8444(); // L: 7703
				var3 = var1.method8435(); // L: 7704
				var4 = var1.method8435(); // L: 7705
				var5 = var4 >> 4 & 15; // L: 7706
				var6 = var4 & 7; // L: 7707
				var7 = var1.method8435(); // L: 7708
				var8 = (var7 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7709
				var9 = (var7 & 7) + class11.field64; // L: 7710
				if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 7711
					var10 = var5 + 1; // L: 7712
					if (class296.localPlayer.pathX[0] >= var8 - var10 && class296.localPlayer.pathX[0] <= var10 + var8 && class296.localPlayer.pathY[0] >= var9 - var10 && class296.localPlayer.pathY[0] <= var9 + var10 && BufferedSink.clientPreferences.method2411() != 0 && var6 > 0 && Client.soundEffectCount < 50) { // L: 7713 7714
						Client.soundEffectIds[Client.soundEffectCount] = var2; // L: 7715
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 7716
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var3; // L: 7717
						Client.soundEffects[Client.soundEffectCount] = null; // L: 7718
						Client.soundLocations[Client.soundEffectCount] = var5 + (var9 << 8) + (var8 << 16); // L: 7719
						++Client.soundEffectCount; // L: 7720
					}
				}
			}

			TileItem var45;
			if (class273.field3108 == var0) { // L: 7725
				var1.method8446(); // L: 7726
				var2 = var1.method8484(); // L: 7727
				var3 = var1.method8435(); // L: 7728
				var4 = (var3 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7729
				var5 = (var3 & 7) + class11.field64; // L: 7730
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7731
					NodeDeque var36 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var4][var5]; // L: 7732
					if (var36 != null) { // L: 7733
						for (var45 = (TileItem)var36.last(); var45 != null; var45 = (TileItem)var36.previous()) { // L: 7734 7735 7740
							if ((var2 & 32767) == var45.id) { // L: 7736
								var45.remove(); // L: 7737
								break;
							}
						}

						if (var36.last() == null) { // L: 7742
							Client.groundItems[ApproximateRouteStrategy.Client_plane][var4][var5] = null;
						}

						class162.updateItemPile(var4, var5); // L: 7743
					}
				}

			} else {
				byte var37;
				if (class273.field3106 == var0) { // L: 7748
					var2 = var1.method8446(); // L: 7749
					var37 = var1.method8469(); // L: 7750
					var4 = var1.readUnsignedByte(); // L: 7751
					var5 = var4 >> 2; // L: 7752
					var6 = var4 & 3; // L: 7753
					var7 = Client.field565[var5]; // L: 7754
					var8 = var1.readUnsignedByte(); // L: 7755
					var9 = (var8 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7756
					var10 = (var8 & 7) + class11.field64; // L: 7757
					byte var11 = var1.readByte(); // L: 7758
					var12 = var1.method8469(); // L: 7759
					byte var13 = var1.method8440(); // L: 7760
					var14 = var1.readUnsignedShort(); // L: 7761
					int var15 = var1.method8446(); // L: 7762
					int var16 = var1.method8484(); // L: 7763
					Player var17;
					if (var15 == Client.localPlayerIndex) { // L: 7765
						var17 = class296.localPlayer;
					} else {
						var17 = Client.players[var15]; // L: 7766
					}

					if (var17 != null) { // L: 7767
						ObjectComposition var18 = InterfaceParent.getObjectDefinition(var16); // L: 7768
						int var19;
						int var20;
						if (var6 != 1 && var6 != 3) { // L: 7771
							var19 = var18.sizeX; // L: 7776
							var20 = var18.sizeY; // L: 7777
						} else {
							var19 = var18.sizeY; // L: 7772
							var20 = var18.sizeX; // L: 7773
						}

						int var21 = var9 + (var19 >> 1); // L: 7779
						int var22 = var9 + (var19 + 1 >> 1); // L: 7780
						int var23 = var10 + (var20 >> 1); // L: 7781
						int var24 = var10 + (var20 + 1 >> 1); // L: 7782
						int[][] var25 = Tiles.Tiles_heights[ApproximateRouteStrategy.Client_plane]; // L: 7783
						int var26 = var25[var22][var24] + var25[var21][var23] + var25[var22][var23] + var25[var21][var24] >> 2; // L: 7784
						int var27 = (var9 << 7) + (var19 << 6); // L: 7785
						int var28 = (var10 << 7) + (var20 << 6); // L: 7786
						Model var29 = var18.getModel(var5, var6, var25, var27, var26, var28); // L: 7787
						if (var29 != null) { // L: 7788
							NetFileRequest.method6340(ApproximateRouteStrategy.Client_plane, var9, var10, var7, -1, 0, 0, 31, var2 + 1, var14 + 1); // L: 7789
							var17.animationCycleStart = var2 + Client.cycle; // L: 7790
							var17.animationCycleEnd = var14 + Client.cycle; // L: 7791
							var17.model0 = var29; // L: 7792
							var17.field1095 = var9 * 128 + var19 * 64; // L: 7793
							var17.field1100 = var10 * 128 + var20 * 64; // L: 7794
							var17.tileHeight2 = var26; // L: 7795
							byte var30;
							if (var11 > var12) { // L: 7796
								var30 = var11; // L: 7797
								var11 = var12; // L: 7798
								var12 = var30; // L: 7799
							}

							if (var37 > var13) { // L: 7801
								var30 = var37; // L: 7802
								var37 = var13; // L: 7803
								var13 = var30; // L: 7804
							}

							var17.minX = var11 + var9; // L: 7806
							var17.maxX = var12 + var9; // L: 7807
							var17.minY = var37 + var10; // L: 7808
							var17.maxY = var10 + var13; // L: 7809
						}
					}
				}

				if (class273.field3111 == var0) { // L: 7813
					var2 = var1.method8436() * 4; // L: 7814
					var37 = var1.readByte(); // L: 7815
					var4 = var1.method8446(); // L: 7816
					var5 = var1.method8444(); // L: 7817
					var6 = var1.method8446(); // L: 7818
					var7 = var1.method8436(); // L: 7819
					var8 = var1.method8436() * 4; // L: 7820
					byte var39 = var1.method8440(); // L: 7821
					var10 = var1.method8623(); // L: 7822
					var40 = (var10 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7823
					var41 = (var10 & 7) + class11.field64; // L: 7824
					var42 = var1.method8448(); // L: 7825
					var14 = var1.readUnsignedByte(); // L: 7826
					var9 = var39 + var40; // L: 7827
					var3 = var37 + var41; // L: 7828
					if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var9 >= 0 && var3 >= 0 && var9 < 104 && var3 < 104 && var4 != 65535) { // L: 7829
						var40 = var40 * 128 + 64; // L: 7830
						var41 = var41 * 128 + 64; // L: 7831
						var9 = var9 * 128 + 64; // L: 7832
						var3 = var3 * 128 + 64; // L: 7833
						var35 = new Projectile(var4, ApproximateRouteStrategy.Client_plane, var40, var41, class132.getTileHeight(var40, var41, ApproximateRouteStrategy.Client_plane) - var2, var6 + Client.cycle, var5 + Client.cycle, var14, var7, var42, var8); // L: 7834
						var35.setDestination(var9, var3, class132.getTileHeight(var9, var3, ApproximateRouteStrategy.Client_plane) - var8, var6 + Client.cycle); // L: 7835
						Client.projectiles.addFirst(var35); // L: 7836
					}

				} else if (class273.field3114 == var0) { // L: 7840
					var2 = var1.method8623(); // L: 7841
					var3 = var1.readUnsignedShort(); // L: 7842
					var4 = var1.readUnsignedByte(); // L: 7843
					var5 = (var4 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7844
					var6 = (var4 & 7) + class11.field64; // L: 7845
					var7 = var1.method8484(); // L: 7846
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7847
						var5 = var5 * 128 + 64; // L: 7848
						var6 = var6 * 128 + 64; // L: 7849
						GraphicsObject var44 = new GraphicsObject(var7, ApproximateRouteStrategy.Client_plane, var5, var6, class132.getTileHeight(var5, var6, ApproximateRouteStrategy.Client_plane) - var2, var3, Client.cycle); // L: 7850
						Client.graphicsObjects.addFirst(var44); // L: 7851
					}

				} else if (class273.field3119 == var0) { // L: 7855
					var2 = var1.method8623(); // L: 7856
					var3 = var2 >> 2; // L: 7857
					var4 = var2 & 3; // L: 7858
					var5 = Client.field565[var3]; // L: 7859
					var6 = var1.readUnsignedShort(); // L: 7860
					var7 = var1.readUnsignedByte(); // L: 7861
					var8 = (var7 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7862
					var9 = (var7 & 7) + class11.field64; // L: 7863
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 7864
						NetFileRequest.method6340(ApproximateRouteStrategy.Client_plane, var8, var9, var5, var6, var3, var4, 31, 0, -1); // L: 7865
					}

				} else if (class273.field3110 == var0) { // L: 7869
					var2 = var1.readUnsignedShort(); // L: 7870
					var3 = var1.method8435(); // L: 7871
					var4 = (var3 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7872
					var5 = (var3 & 7) + class11.field64; // L: 7873
					var6 = var1.method8446(); // L: 7874
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7875
						var45 = new TileItem(); // L: 7876
						var45.id = var6; // L: 7877
						var45.quantity = var2; // L: 7878
						if (Client.groundItems[ApproximateRouteStrategy.Client_plane][var4][var5] == null) { // L: 7879
							Client.groundItems[ApproximateRouteStrategy.Client_plane][var4][var5] = new NodeDeque();
						}

						Client.groundItems[ApproximateRouteStrategy.Client_plane][var4][var5].addFirst(var45); // L: 7880
						class162.updateItemPile(var4, var5); // L: 7881
					}

				} else if (class273.field3107 == var0) { // L: 7885
					var2 = var1.method8623(); // L: 7886
					var3 = (var2 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7887
					var4 = (var2 & 7) + class11.field64; // L: 7888
					var5 = var1.method8484(); // L: 7889
					var6 = var1.method8435(); // L: 7890
					var7 = var6 >> 2; // L: 7891
					var8 = var6 & 3; // L: 7892
					var9 = Client.field565[var7]; // L: 7893
					if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) { // L: 7894
						if (var9 == 0) { // L: 7895
							WallObject var34 = class139.scene.method4293(ApproximateRouteStrategy.Client_plane, var3, var4); // L: 7896
							if (var34 != null) { // L: 7897
								var40 = AttackOption.Entity_unpackID(var34.tag); // L: 7898
								if (var7 == 2) { // L: 7899
									var34.renderable1 = new DynamicObject(var40, 2, var8 + 4, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var34.renderable1); // L: 7900
									var34.renderable2 = new DynamicObject(var40, 2, var8 + 1 & 3, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var34.renderable2); // L: 7901
								} else {
									var34.renderable1 = new DynamicObject(var40, var7, var8, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var34.renderable1); // L: 7903
								}
							}
						}

						if (var9 == 1) { // L: 7906
							DecorativeObject var46 = class139.scene.method4294(ApproximateRouteStrategy.Client_plane, var3, var4); // L: 7907
							if (var46 != null) { // L: 7908
								var40 = AttackOption.Entity_unpackID(var46.tag); // L: 7909
								if (var7 != 4 && var7 != 5) { // L: 7910
									if (var7 == 6) { // L: 7911
										var46.renderable1 = new DynamicObject(var40, 4, var8 + 4, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var46.renderable1);
									} else if (var7 == 7) { // L: 7912
										var46.renderable1 = new DynamicObject(var40, 4, (var8 + 2 & 3) + 4, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var46.renderable1);
									} else if (var7 == 8) { // L: 7913
										var46.renderable1 = new DynamicObject(var40, 4, var8 + 4, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var46.renderable1); // L: 7914
										var46.renderable2 = new DynamicObject(var40, 4, (var8 + 2 & 3) + 4, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var46.renderable2); // L: 7915
									}
								} else {
									var46.renderable1 = new DynamicObject(var40, 4, var8, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var46.renderable1);
								}
							}
						}

						if (var9 == 2) { // L: 7919
							GameObject var47 = class139.scene.getGameObject(ApproximateRouteStrategy.Client_plane, var3, var4); // L: 7920
							if (var7 == 11) { // L: 7921
								var7 = 10;
							}

							if (var47 != null) { // L: 7922
								var47.renderable = new DynamicObject(AttackOption.Entity_unpackID(var47.tag), var7, var8, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var47.renderable);
							}
						}

						if (var9 == 3) { // L: 7924
							GroundObject var48 = class139.scene.getGroundObject(ApproximateRouteStrategy.Client_plane, var3, var4); // L: 7925
							if (var48 != null) { // L: 7926
								var48.renderable = new DynamicObject(AttackOption.Entity_unpackID(var48.tag), 22, var8, ApproximateRouteStrategy.Client_plane, var3, var4, var5, false, var48.renderable);
							}
						}
					}

				} else if (class273.field3116 == var0) { // L: 7931
					var2 = var1.method8436(); // L: 7932
					var3 = (var2 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7933
					var4 = (var2 & 7) + class11.field64; // L: 7934
					var5 = var1.method8444(); // L: 7935
					var6 = var1.method8444(); // L: 7936
					var7 = var1.readUnsignedShort(); // L: 7937
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7938
						NodeDeque var43 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var3][var4]; // L: 7939
						if (var43 != null) { // L: 7940
							for (TileItem var33 = (TileItem)var43.last(); var33 != null; var33 = (TileItem)var43.previous()) { // L: 7941 7942 7947
								if ((var7 & 32767) == var33.id && var5 == var33.quantity) { // L: 7943
									var33.quantity = var6; // L: 7944
									break;
								}
							}

							class162.updateItemPile(var3, var4); // L: 7949
						}
					}

				} else {
					TileItem var31;
					if (class273.field3117 != var0) { // L: 7954
						if (class273.field3113 == var0) { // L: 7975
							var2 = var1.readUnsignedByte(); // L: 7976
							var3 = var2 >> 2; // L: 7977
							var4 = var2 & 3; // L: 7978
							var5 = Client.field565[var3]; // L: 7979
							var6 = var1.readUnsignedByte(); // L: 7980
							var7 = (var6 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7981
							var8 = (var6 & 7) + class11.field64; // L: 7982
							if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7983
								NetFileRequest.method6340(ApproximateRouteStrategy.Client_plane, var7, var8, var5, -1, var3, var4, 31, 0, -1); // L: 7984
							}

						} else if (class273.field3121 == var0) { // L: 7988
							var2 = var1.readUnsignedByte(); // L: 7989
							var3 = var1.method8456(); // L: 7990
							var4 = var1.method8436(); // L: 7991
							var5 = (var4 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7992
							var6 = (var4 & 7) + class11.field64; // L: 7993
							var7 = var1.method8484(); // L: 7994
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7995
								var31 = new TileItem(); // L: 7996
								var31.id = var7; // L: 7997
								var31.quantity = var3; // L: 7998
								var31.method2545(var2); // L: 7999
								if (Client.groundItems[ApproximateRouteStrategy.Client_plane][var5][var6] == null) { // L: 8000
									Client.groundItems[ApproximateRouteStrategy.Client_plane][var5][var6] = new NodeDeque(); // L: 8001
								}

								Client.groundItems[ApproximateRouteStrategy.Client_plane][var5][var6].addFirst(var31); // L: 8003
								class162.updateItemPile(var5, var6); // L: 8004
							}

						} else if (class273.field3118 == var0) { // L: 8008
							var2 = var1.method8484(); // L: 8009
							var3 = var1.method8435(); // L: 8010
							var4 = var1.method8623(); // L: 8011
							var5 = (var4 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 8012
							var6 = (var4 & 7) + class11.field64; // L: 8013
							var7 = var1.method8435(); // L: 8014
							var8 = var7 >> 2; // L: 8015
							var9 = var7 & 3; // L: 8016
							var10 = Client.field565[var8]; // L: 8017
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 8018
								NetFileRequest.method6340(ApproximateRouteStrategy.Client_plane, var5, var6, var10, var2, var8, var9, var3, 0, -1); // L: 8019
							}

						}
					} else {
						var2 = var1.method8436(); // L: 7955
						var3 = (var2 >> 4 & 7) + DevicePcmPlayerProvider.field122; // L: 7956
						var4 = (var2 & 7) + class11.field64; // L: 7957
						var5 = var1.method8435(); // L: 7958
						var6 = var1.method8446(); // L: 7959
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7960
							NodeDeque var32 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var3][var4]; // L: 7961
							if (var32 != null) { // L: 7962
								for (var31 = (TileItem)var32.last(); var31 != null; var31 = (TileItem)var32.previous()) { // L: 7963 7964 7969
									if ((var6 & 32767) == var31.id) { // L: 7965
										var31.method2545(var5); // L: 7966
										break;
									}
								}
							}
						}

					}
				}
			}
		}
	} // L: 7700 7746 7838 7853 7867 7883 7929 7952 7973 7986 8006 8021 8023
}
