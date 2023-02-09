import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1980182519
	)
	static int field4284;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1953927973
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 2110626999825614057L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("s")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("z")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lrd;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method6719(2); // L: 118
		this.grandExchangeOffer.method6710(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1767360922"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-36"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("r")
	static final void method6700(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 95
	} // L: 96

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IILhz;I)V",
		garbageValue = "-992361699"
	)
	static final void method6704(Player var0, int var1, int var2, class208 var3) {
		int var4 = var0.pathX[0]; // L: 8850
		int var5 = var0.pathY[0]; // L: 8851
		int var6 = var0.transformedSize(); // L: 8852
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 8853
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 8854
				int var8 = var0.transformedSize(); // L: 8856
				RouteStrategy var9 = class322.method6431(var1, var2); // L: 8857
				CollisionMap var10 = Client.collisionMaps[var0.plane]; // L: 8858
				int[] var11 = Client.field802; // L: 8859
				int[] var12 = Client.field785; // L: 8860

				int var13;
				int var14;
				for (var13 = 0; var13 < 128; ++var13) { // L: 8862
					for (var14 = 0; var14 < 128; ++var14) { // L: 8863
						class209.directions[var13][var14] = 0; // L: 8864
						class209.distances[var13][var14] = 99999999; // L: 8865
					}
				}

				int var15;
				int var16;
				byte var18;
				int var19;
				int var20;
				int var22;
				int var24;
				int var25;
				int var26;
				int var27;
				boolean var33;
				int var35;
				int var36;
				int var38;
				if (var8 == 1) { // L: 8869
					var33 = ClanSettings.method3235(var4, var5, var9, var10);
				} else {
					byte var17;
					byte var21;
					int[][] var23;
					boolean var34;
					if (var8 == 2) { // L: 8870
						var15 = var4; // L: 8873
						var16 = var5; // L: 8874
						var17 = 64; // L: 8875
						var18 = 64; // L: 8876
						var19 = var4 - var17; // L: 8877
						var20 = var5 - var18; // L: 8878
						class209.directions[var17][var18] = 99; // L: 8879
						class209.distances[var17][var18] = 0; // L: 8880
						var21 = 0; // L: 8881
						var22 = 0; // L: 8882
						class209.bufferX[var21] = var4; // L: 8883
						var38 = var21 + 1;
						class209.bufferY[var21] = var5; // L: 8884
						var23 = var10.flags; // L: 8885

						while (true) {
							if (var38 == var22) { // L: 8886
								class209.field2371 = var15; // L: 8986
								class209.field2372 = var16; // L: 8987
								var34 = false; // L: 8988
								break;
							}

							var15 = class209.bufferX[var22]; // L: 8887
							var16 = class209.bufferY[var22]; // L: 8888
							var22 = var22 + 1 & 4095; // L: 8889
							var35 = var15 - var19; // L: 8890
							var36 = var16 - var20; // L: 8891
							var24 = var15 - var10.xInset; // L: 8892
							var25 = var16 - var10.yInset; // L: 8893
							if (var9.hasArrived(2, var15, var16, var10)) { // L: 8894
								class209.field2371 = var15; // L: 8895
								class209.field2372 = var16; // L: 8896
								var34 = true; // L: 8897
								break;
							}

							var26 = class209.distances[var35][var36] + 1; // L: 8900
							if (var35 > 0 && class209.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + 1] & 19136824) == 0) { // L: 8901 8902 8903 8904
								class209.bufferX[var38] = var15 - 1; // L: 8905
								class209.bufferY[var38] = var16; // L: 8906
								var38 = var38 + 1 & 4095; // L: 8907
								class209.directions[var35 - 1][var36] = 2; // L: 8908
								class209.distances[var35 - 1][var36] = var26; // L: 8909
							}

							if (var35 < 126 && class209.directions[var35 + 1][var36] == 0 && (var23[var24 + 2][var25] & 19136899) == 0 && (var23[var24 + 2][var25 + 1] & 19136992) == 0) { // L: 8911 8912 8913 8914
								class209.bufferX[var38] = var15 + 1; // L: 8915
								class209.bufferY[var38] = var16; // L: 8916
								var38 = var38 + 1 & 4095; // L: 8917
								class209.directions[var35 + 1][var36] = 8; // L: 8918
								class209.distances[var35 + 1][var36] = var26; // L: 8919
							}

							if (var36 > 0 && class209.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var24 + 1][var25 - 1] & 19136899) == 0) { // L: 8921 8922 8923 8924
								class209.bufferX[var38] = var15; // L: 8925
								class209.bufferY[var38] = var16 - 1; // L: 8926
								var38 = var38 + 1 & 4095; // L: 8927
								class209.directions[var35][var36 - 1] = 1; // L: 8928
								class209.distances[var35][var36 - 1] = var26; // L: 8929
							}

							if (var36 < 126 && class209.directions[var35][var36 + 1] == 0 && (var23[var24][var25 + 2] & 19136824) == 0 && (var23[var24 + 1][var25 + 2] & 19136992) == 0) { // L: 8931 8932 8933 8934
								class209.bufferX[var38] = var15; // L: 8935
								class209.bufferY[var38] = var16 + 1; // L: 8936
								var38 = var38 + 1 & 4095; // L: 8937
								class209.directions[var35][var36 + 1] = 4; // L: 8938
								class209.distances[var35][var36 + 1] = var26; // L: 8939
							}

							if (var35 > 0 && var36 > 0 && class209.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25] & 19136830) == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0 && (var23[var24][var25 - 1] & 19136911) == 0) { // L: 8941 8942 8943 8944 8945
								class209.bufferX[var38] = var15 - 1; // L: 8946
								class209.bufferY[var38] = var16 - 1; // L: 8947
								var38 = var38 + 1 & 4095; // L: 8948
								class209.directions[var35 - 1][var36 - 1] = 3; // L: 8949
								class209.distances[var35 - 1][var36 - 1] = var26; // L: 8950
							}

							if (var35 < 126 && var36 > 0 && class209.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + 1][var25 - 1] & 19136911) == 0 && (var23[var24 + 2][var25 - 1] & 19136899) == 0 && (var23[var24 + 2][var25] & 19136995) == 0) { // L: 8952 8953 8954 8955 8956
								class209.bufferX[var38] = var15 + 1; // L: 8957
								class209.bufferY[var38] = var16 - 1; // L: 8958
								var38 = var38 + 1 & 4095; // L: 8959
								class209.directions[var35 + 1][var36 - 1] = 9; // L: 8960
								class209.distances[var35 + 1][var36 - 1] = var26; // L: 8961
							}

							if (var35 > 0 && var36 < 126 && class209.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + 1] & 19136830) == 0 && (var23[var24 - 1][var25 + 2] & 19136824) == 0 && (var23[var24][var25 + 2] & 19137016) == 0) { // L: 8963 8964 8965 8966 8967
								class209.bufferX[var38] = var15 - 1; // L: 8968
								class209.bufferY[var38] = var16 + 1; // L: 8969
								var38 = var38 + 1 & 4095; // L: 8970
								class209.directions[var35 - 1][var36 + 1] = 6; // L: 8971
								class209.distances[var35 - 1][var36 + 1] = var26; // L: 8972
							}

							if (var35 < 126 && var36 < 126 && class209.directions[var35 + 1][var36 + 1] == 0 && (var23[var24 + 1][var25 + 2] & 19137016) == 0 && (var23[var24 + 2][var25 + 2] & 19136992) == 0 && (var23[var24 + 2][var25 + 1] & 19136995) == 0) { // L: 8974 8975 8976 8977 8978
								class209.bufferX[var38] = var15 + 1; // L: 8979
								class209.bufferY[var38] = var16 + 1; // L: 8980
								var38 = var38 + 1 & 4095; // L: 8981
								class209.directions[var35 + 1][var36 + 1] = 12; // L: 8982
								class209.distances[var35 + 1][var36 + 1] = var26; // L: 8983
							}
						}

						var33 = var34; // L: 8990
					} else {
						var15 = var4; // L: 8995
						var16 = var5; // L: 8996
						var17 = 64; // L: 8997
						var18 = 64; // L: 8998
						var19 = var4 - var17; // L: 8999
						var20 = var5 - var18; // L: 9000
						class209.directions[var17][var18] = 99; // L: 9001
						class209.distances[var17][var18] = 0; // L: 9002
						var21 = 0; // L: 9003
						var22 = 0; // L: 9004
						class209.bufferX[var21] = var4; // L: 9005
						var38 = var21 + 1;
						class209.bufferY[var21] = var5; // L: 9006
						var23 = var10.flags; // L: 9007

						label664:
						while (true) {
							label662:
							while (true) {
								do {
									do {
										do {
											label639:
											do {
												if (var22 == var38) { // L: 9008
													class209.field2371 = var15; // L: 9128
													class209.field2372 = var16; // L: 9129
													var34 = false; // L: 9130
													break label664;
												}

												var15 = class209.bufferX[var22]; // L: 9009
												var16 = class209.bufferY[var22]; // L: 9010
												var22 = var22 + 1 & 4095; // L: 9011
												var35 = var15 - var19; // L: 9012
												var36 = var16 - var20; // L: 9013
												var24 = var15 - var10.xInset; // L: 9014
												var25 = var16 - var10.yInset; // L: 9015
												if (var9.hasArrived(var8, var15, var16, var10)) { // L: 9016
													class209.field2371 = var15; // L: 9017
													class209.field2372 = var16; // L: 9018
													var34 = true; // L: 9019
													break label664;
												}

												var26 = class209.distances[var35][var36] + 1; // L: 9022
												if (var35 > 0 && class209.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + var8 - 1] & 19136824) == 0) { // L: 9023 9024 9025 9026
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class209.bufferX[var38] = var15 - 1; // L: 9030
															class209.bufferY[var38] = var16; // L: 9031
															var38 = var38 + 1 & 4095; // L: 9032
															class209.directions[var35 - 1][var36] = 2; // L: 9033
															class209.distances[var35 - 1][var36] = var26; // L: 9034
															break;
														}

														if ((var23[var24 - 1][var27 + var25] & 19136830) != 0) { // L: 9028
															break;
														}

														++var27; // L: 9027
													}
												}

												if (var35 < 128 - var8 && class209.directions[var35 + 1][var36] == 0 && (var23[var8 + var24][var25] & 19136899) == 0 && (var23[var8 + var24][var25 + var8 - 1] & 19136992) == 0) { // L: 9036 9037 9038 9039
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class209.bufferX[var38] = var15 + 1; // L: 9043
															class209.bufferY[var38] = var16; // L: 9044
															var38 = var38 + 1 & 4095; // L: 9045
															class209.directions[var35 + 1][var36] = 8; // L: 9046
															class209.distances[var35 + 1][var36] = var26; // L: 9047
															break;
														}

														if ((var23[var8 + var24][var27 + var25] & 19136995) != 0) { // L: 9041
															break;
														}

														++var27; // L: 9040
													}
												}

												if (var36 > 0 && class209.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var24 + var8 - 1][var25 - 1] & 19136899) == 0) { // L: 9049 9050 9051 9052
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class209.bufferX[var38] = var15; // L: 9056
															class209.bufferY[var38] = var16 - 1; // L: 9057
															var38 = var38 + 1 & 4095; // L: 9058
															class209.directions[var35][var36 - 1] = 1; // L: 9059
															class209.distances[var35][var36 - 1] = var26; // L: 9060
															break;
														}

														if ((var23[var27 + var24][var25 - 1] & 19136911) != 0) { // L: 9054
															break;
														}

														++var27; // L: 9053
													}
												}

												if (var36 < 128 - var8 && class209.directions[var35][var36 + 1] == 0 && (var23[var24][var8 + var25] & 19136824) == 0 && (var23[var24 + var8 - 1][var8 + var25] & 19136992) == 0) { // L: 9062 9063 9064 9065
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class209.bufferX[var38] = var15; // L: 9069
															class209.bufferY[var38] = var16 + 1; // L: 9070
															var38 = var38 + 1 & 4095; // L: 9071
															class209.directions[var35][var36 + 1] = 4; // L: 9072
															class209.distances[var35][var36 + 1] = var26; // L: 9073
															break;
														}

														if ((var23[var27 + var24][var8 + var25] & 19137016) != 0) { // L: 9067
															break;
														}

														++var27; // L: 9066
													}
												}

												if (var35 > 0 && var36 > 0 && class209.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0) { // L: 9075 9076 9077
													var27 = 1;

													while (true) {
														if (var27 >= var8) {
															class209.bufferX[var38] = var15 - 1; // L: 9082
															class209.bufferY[var38] = var16 - 1; // L: 9083
															var38 = var38 + 1 & 4095; // L: 9084
															class209.directions[var35 - 1][var36 - 1] = 3; // L: 9085
															class209.distances[var35 - 1][var36 - 1] = var26; // L: 9086
															break;
														}

														if ((var23[var24 - 1][var27 + (var25 - 1)] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 - 1] & 19136911) != 0) { // L: 9079 9080
															break;
														}

														++var27; // L: 9078
													}
												}

												if (var35 < 128 - var8 && var36 > 0 && class209.directions[var35 + 1][var36 - 1] == 0 && (var23[var8 + var24][var25 - 1] & 19136899) == 0) { // L: 9088 9089 9090
													var27 = 1;

													while (true) {
														if (var27 >= var8) {
															class209.bufferX[var38] = var15 + 1; // L: 9095
															class209.bufferY[var38] = var16 - 1; // L: 9096
															var38 = var38 + 1 & 4095; // L: 9097
															class209.directions[var35 + 1][var36 - 1] = 9; // L: 9098
															class209.distances[var35 + 1][var36 - 1] = var26; // L: 9099
															break;
														}

														if ((var23[var8 + var24][var27 + (var25 - 1)] & 19136995) != 0 || (var23[var27 + var24][var25 - 1] & 19136911) != 0) { // L: 9092 9093
															break;
														}

														++var27; // L: 9091
													}
												}

												if (var35 > 0 && var36 < 128 - var8 && class209.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + var8] & 19136824) == 0) { // L: 9101 9102 9103
													for (var27 = 1; var27 < var8; ++var27) { // L: 9104
														if ((var23[var24 - 1][var25 + var27] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var8 + var25] & 19137016) != 0) { // L: 9105 9106
															continue label639;
														}
													}

													class209.bufferX[var38] = var15 - 1; // L: 9108
													class209.bufferY[var38] = var16 + 1; // L: 9109
													var38 = var38 + 1 & 4095; // L: 9110
													class209.directions[var35 - 1][var36 + 1] = 6; // L: 9111
													class209.distances[var35 - 1][var36 + 1] = var26; // L: 9112
												}
											} while(var35 >= 128 - var8); // L: 9114
										} while(var36 >= 128 - var8);
									} while(class209.directions[var35 + 1][var36 + 1] != 0); // L: 9115
								} while((var23[var8 + var24][var25 + var8] & 19136992) != 0); // L: 9116

								for (var27 = 1; var27 < var8; ++var27) { // L: 9117
									if ((var23[var24 + var27][var8 + var25] & 19137016) != 0 || (var23[var8 + var24][var25 + var27] & 19136995) != 0) { // L: 9118 9119
										continue label662;
									}
								}

								class209.bufferX[var38] = var15 + 1; // L: 9121
								class209.bufferY[var38] = var16 + 1; // L: 9122
								var38 = var38 + 1 & 4095; // L: 9123
								class209.directions[var35 + 1][var36 + 1] = 12; // L: 9124
								class209.distances[var35 + 1][var36 + 1] = var26; // L: 9125
							}
						}

						var33 = var34; // L: 9132
					}
				}

				int var7;
				label712: {
					var14 = var4 - 64; // L: 9134
					var15 = var5 - 64; // L: 9135
					var16 = class209.field2371; // L: 9136
					var35 = class209.field2372; // L: 9137
					if (!var33) { // L: 9138
						var36 = Integer.MAX_VALUE; // L: 9140
						var19 = Integer.MAX_VALUE; // L: 9141
						byte var37 = 10; // L: 9142
						var38 = var9.approxDestinationX; // L: 9143
						var22 = var9.approxDestinationY; // L: 9144
						int var32 = var9.approxDestinationSizeX; // L: 9145
						var24 = var9.approxDestinationSizeY; // L: 9146

						for (var25 = var38 - var37; var25 <= var37 + var38; ++var25) { // L: 9147
							for (var26 = var22 - var37; var26 <= var22 + var37; ++var26) { // L: 9148
								var27 = var25 - var14; // L: 9149
								int var28 = var26 - var15; // L: 9150
								if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class209.distances[var27][var28] < 100) { // L: 9151 9152
									int var29 = 0; // L: 9153
									if (var25 < var38) { // L: 9154
										var29 = var38 - var25;
									} else if (var25 > var38 + var32 - 1) { // L: 9155
										var29 = var25 - (var38 + var32 - 1);
									}

									int var30 = 0; // L: 9156
									if (var26 < var22) { // L: 9157
										var30 = var22 - var26;
									} else if (var26 > var24 + var22 - 1) { // L: 9158
										var30 = var26 - (var22 + var24 - 1);
									}

									int var31 = var30 * var30 + var29 * var29; // L: 9159
									if (var31 < var36 || var31 == var36 && class209.distances[var27][var28] < var19) { // L: 9160
										var36 = var31; // L: 9161
										var19 = class209.distances[var27][var28]; // L: 9162
										var16 = var25; // L: 9163
										var35 = var26; // L: 9164
									}
								}
							}
						}

						if (var36 == Integer.MAX_VALUE) { // L: 9170
							var7 = -1; // L: 9171
							break label712;
						}
					}

					if (var16 == var4 && var35 == var5) { // L: 9180
						var11[0] = var16; // L: 9181
						var12[0] = var35; // L: 9182
						var7 = 0; // L: 9183
					} else {
						var18 = 0; // L: 9186
						class209.bufferX[var18] = var16; // L: 9189
						var36 = var18 + 1;
						class209.bufferY[var18] = var35; // L: 9190

						for (var19 = var20 = class209.directions[var16 - var14][var35 - var15]; var16 != var4 || var5 != var35; var19 = class209.directions[var16 - var14][var35 - var15]) { // L: 9191 9192 9202
							if (var20 != var19) { // L: 9193
								var20 = var19; // L: 9194
								class209.bufferX[var36] = var16; // L: 9195
								class209.bufferY[var36++] = var35; // L: 9196
							}

							if ((var19 & 2) != 0) { // L: 9198
								++var16;
							} else if ((var19 & 8) != 0) { // L: 9199
								--var16;
							}

							if ((var19 & 1) != 0) { // L: 9200
								++var35;
							} else if ((var19 & 4) != 0) { // L: 9201
								--var35;
							}
						}

						var38 = 0; // L: 9204

						while (var36-- > 0) { // L: 9205
							var11[var38] = class209.bufferX[var36]; // L: 9206
							var12[var38++] = class209.bufferY[var36]; // L: 9207
							if (var38 >= var11.length) { // L: 9208
								break;
							}
						}

						var7 = var38; // L: 9210
					}
				}

				var13 = var7; // L: 9212
				if (var7 >= 1) { // L: 9213
					for (var14 = 0; var14 < var13 - 1; ++var14) { // L: 9214
						var0.method2390(Client.field802[var14], Client.field785[var14], var3);
					}

				}
			}
		}
	} // L: 9215
}
