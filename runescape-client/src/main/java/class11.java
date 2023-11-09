import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("ao")
class class11 implements TlsAuthentication {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 306
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 310
			LinkedList var3 = new LinkedList(); // L: 311
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 313

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 314
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 315
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 317
			}

			this.this$2.this$1.field61 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 321
		} catch (CertificateException var7) { // L: 323
			throw new IOException(var7); // L: 324
		}
	} // L: 326

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 330
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "([Lmq;IIIIIIIII)V",
		garbageValue = "-465475629"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9983
		class18.method271(); // L: 9984

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9985
			Widget var10 = var0[var9]; // L: 9986
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9987 9988
				int var11;
				if (var8 == -1) { // L: 9990
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9991
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9992
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9993
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9994
					var11 = ++Client.rootWidgetCount - 1; // L: 9995
				} else {
					var11 = var8; // L: 9997
				}

				var10.rootIndex = var11; // L: 9998
				var10.cycle = Client.cycle; // L: 9999
				if (!var10.isIf3 || !class393.isComponentHidden(var10)) { // L: 10000
					if (var10.contentType > 0) { // L: 10001
						MouseHandler.method712(var10);
					}

					int var12 = var10.x + var6; // L: 10002
					int var13 = var7 + var10.y; // L: 10003
					int var14 = var10.transparencyTop; // L: 10004
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10005
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10006
							WorldMapSection2.field2877 = var0; // L: 10007
							class230.field2684 = var6; // L: 10008
							class101.field1328 = var7; // L: 10009
							continue; // L: 10010
						}

						if (Client.isDraggingWidget && Client.field672) { // L: 10012
							var15 = MouseHandler.MouseHandler_x; // L: 10013
							var16 = MouseHandler.MouseHandler_y; // L: 10014
							var15 -= Client.widgetClickX; // L: 10015
							var16 -= Client.widgetClickY; // L: 10016
							if (var15 < Client.field627) { // L: 10017
								var15 = Client.field627;
							}

							if (var15 + var10.width > Client.field627 + Client.clickedWidgetParent.width) { // L: 10018
								var15 = Client.field627 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field674) { // L: 10019
								var16 = Client.field674;
							}

							if (var16 + var10.height > Client.field674 + Client.clickedWidgetParent.height) { // L: 10020
								var16 = Client.field674 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10021
							var13 = var16; // L: 10022
						}

						if (!var10.isScrollBar) { // L: 10024
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10030
						var19 = var12; // L: 10031
						var20 = var13; // L: 10032
						var21 = var12 + var10.width; // L: 10033
						var22 = var13 + var10.height; // L: 10034
						if (var21 < var12) { // L: 10035
							var19 = var21; // L: 10037
							var21 = var12; // L: 10038
						}

						if (var22 < var13) { // L: 10040
							var20 = var22; // L: 10042
							var22 = var13; // L: 10043
						}

						++var21; // L: 10045
						++var22; // L: 10046
						var15 = var19 > var2 ? var19 : var2; // L: 10047
						var16 = var20 > var3 ? var20 : var3; // L: 10048
						var17 = var21 < var4 ? var21 : var4; // L: 10049
						var18 = var22 < var5 ? var22 : var5; // L: 10050
					} else {
						var19 = var12 + var10.width; // L: 10053
						var20 = var13 + var10.height; // L: 10054
						var15 = var12 > var2 ? var12 : var2; // L: 10055
						var16 = var13 > var3 ? var13 : var3; // L: 10056
						var17 = var19 < var4 ? var19 : var4; // L: 10057
						var18 = var20 < var5 ? var20 : var5; // L: 10058
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10060
						if (var10.contentType != 0) { // L: 10061
							if (var10.contentType == 1336) { // L: 10062
								if (class20.clientPreferences.method2455()) { // L: 10063
									var13 += 15; // L: 10064
									DecorativeObject.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10065
									var13 += 15; // L: 10066
									Runtime var41 = Runtime.getRuntime(); // L: 10067
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10068
									var21 = 16776960; // L: 10069
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10070
										var21 = 16711680;
									}

									DecorativeObject.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10071
									var13 += 15; // L: 10072
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10076
								Client.viewportX = var12; // L: 10077
								Client.viewportY = var13; // L: 10078
								class18.drawEntities(var12, var13, var10.width, var10.height); // L: 10079
								Client.field705[var10.rootIndex] = true; // L: 10080
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10081
								continue; // L: 10082
							}

							if (var10.contentType == 1338) { // L: 10084
								class155.drawMinimap(var10, var12, var13, var11); // L: 10085
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10086
								continue; // L: 10087
							}

							if (var10.contentType == 1339) { // L: 10089
								DynamicObject.drawCompass(var10, var12, var13, var11); // L: 10090
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10091
								continue; // L: 10092
							}

							if (var10.contentType == 1400) { // L: 10094
								class126.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10095
							}

							if (var10.contentType == 1401) { // L: 10097
								class126.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10098
							}

							if (var10.contentType == 1402) { // L: 10100
								class121.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10101
							}
						}

						if (var10.type == 0) { // L: 10104
							if (!var10.isIf3 && class393.isComponentHidden(var10) && var10 != MidiPcmStream.mousedOverWidgetIf1) { // L: 10105
								continue;
							}

							if (!var10.isIf3) { // L: 10106
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10107
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10108
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10110
							if (var10.children != null) { // L: 10111
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10112
							if (var28 != null) { // L: 10113
								class13.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10114
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10116
							class18.method271(); // L: 10117
						} else if (var10.type == 11) { // L: 10119
							if (class393.isComponentHidden(var10) && var10 != MidiPcmStream.mousedOverWidgetIf1) { // L: 10120
								continue;
							}

							if (var10.children != null) { // L: 10121
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10122
							class18.method271(); // L: 10123
						}

						if (Client.isResizable || Client.field651[var11] || Client.gameDrawingMode > 1) { // L: 10125
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10126 10127
								class103.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10129
								if (var10.type == 3) { // L: 10132
									if (class452.runCs1(var10)) { // L: 10134
										var19 = var10.color2; // L: 10135
										if (var10 == MidiPcmStream.mousedOverWidgetIf1 && var10.field3655 != 0) { // L: 10136
											var19 = var10.field3655;
										}
									} else {
										var19 = var10.color; // L: 10139
										if (var10 == MidiPcmStream.mousedOverWidgetIf1 && var10.field3596 != 0) { // L: 10140
											var19 = var10.field3596;
										}
									}

									if (var10.fill) { // L: 10142
										switch(var10.fillMode.field5072) { // L: 10143
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10152
											break; // L: 10153
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10149
											break; // L: 10150
										default:
											if (var14 == 0) { // L: 10145
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10146
											}
										}
									} else if (var14 == 0) { // L: 10157
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10158
									}
								} else if (var10.type == 4) { // L: 10162
									Font var40 = var10.getFont(); // L: 10163
									if (var40 == null) { // L: 10164
										if (Widget.field3567) { // L: 10165
											class144.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10169
										if (class452.runCs1(var10)) { // L: 10170
											var20 = var10.color2; // L: 10171
											if (var10 == MidiPcmStream.mousedOverWidgetIf1 && var10.field3655 != 0) { // L: 10172
												var20 = var10.field3655;
											}

											if (var10.field3633.length() > 0) { // L: 10173
												var42 = var10.field3633;
											}
										} else {
											var20 = var10.color; // L: 10176
											if (var10 == MidiPcmStream.mousedOverWidgetIf1 && var10.field3596 != 0) { // L: 10177
												var20 = var10.field3596;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10179
											ItemComposition var43 = HealthBarUpdate.ItemComposition_get(var10.itemId); // L: 10180
											var42 = var43.name; // L: 10181
											if (var42 == null) { // L: 10182
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10183
												var42 = class383.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + ArchiveDiskAction.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10185
											var42 = "Please wait..."; // L: 10186
											var20 = var10.color; // L: 10187
										}

										if (!var10.isIf3) { // L: 10189
											var42 = class121.method2979(var42, var10);
										}

										var40.method7414(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, Decimator.method1136(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10190
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10193
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10194
											var38 = var10.getSprite(class452.runCs1(var10), class14.urlRequester); // L: 10195
											if (var38 != null) { // L: 10196
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3567) { // L: 10197
												class144.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10201
												var38 = class252.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.getSprite(false, class14.urlRequester); // L: 10202
											}

											if (var38 == null) { // L: 10203
												if (Widget.field3567) { // L: 10227
													class144.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10204
												var21 = var38.height; // L: 10205
												if (!var10.spriteTiling) { // L: 10206
													var22 = var10.width * 4096 / var20; // L: 10220
													if (var10.spriteAngle != 0) { // L: 10221
														var38.method9601(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10222
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10223
														var38.drawTransBgAt(var12, var13); // L: 10224
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10207
													var22 = (var20 - 1 + var10.width) / var20; // L: 10208
													var23 = (var21 - 1 + var10.height) / var21; // L: 10209

													for (var24 = 0; var24 < var22; ++var24) { // L: 10210
														for (var25 = 0; var25 < var23; ++var25) { // L: 10211
															if (var10.spriteAngle != 0) { // L: 10212
																var38.method9601(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10213
																var38.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var24 * var20, var13 + var21 * var25); // L: 10214
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10217
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10231
											boolean var36 = class452.runCs1(var10); // L: 10232
											if (var36) { // L: 10234
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10235
											}

											Model var39 = null; // L: 10236
											var22 = 0; // L: 10237
											if (var10.itemId != -1) { // L: 10238
												ItemComposition var44 = HealthBarUpdate.ItemComposition_get(var10.itemId); // L: 10239
												if (var44 != null) { // L: 10240
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10241
													var39 = var44.getModel(1); // L: 10242
													if (var39 != null) { // L: 10243
														var39.calculateBoundsCylinder(); // L: 10244
														var22 = var39.height / 2; // L: 10245
													} else {
														class144.invalidateWidget(var10); // L: 10247
													}
												}
											} else if (var10.modelType == 5) { // L: 10250
												if (var10.modelId == 0) { // L: 10251
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = MusicPatchNode.localPlayer.getModel(); // L: 10252
												}
											} else if (var10.modelType == 7) { // L: 10254
												var39 = var10.field3584.getModel((SequenceDefinition)null, -1, ItemContainer.SequenceDefinition_get(MusicPatchNode.localPlayer.idleSequence), MusicPatchNode.localPlayer.movementFrame); // L: 10255
											} else {
												NPCComposition var45 = null; // L: 10258
												class189 var33 = null; // L: 10259
												if (var10.modelType == 6) { // L: 10260
													var25 = var10.modelId; // L: 10261
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10262
														NPC var34 = Client.npcs[var25]; // L: 10263
														if (var34 != null) { // L: 10264
															var45 = var34.definition; // L: 10265
															var33 = var34.method2572(); // L: 10266
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10270
												var26 = -1; // L: 10271
												if (var20 != -1) { // L: 10272
													var35 = ItemContainer.SequenceDefinition_get(var20); // L: 10273
													var26 = var10.modelFrame; // L: 10274
												}

												var39 = var10.method6361(var35, var26, var36, MusicPatchNode.localPlayer.appearance, var45, var33); // L: 10276
												if (var39 == null && Widget.field3567) { // L: 10277
													class144.invalidateWidget(var10);
												}
											}

											WorldMapArea.method5163(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10279
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10280
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10281
											if (var39 != null) { // L: 10282
												if (!var10.isIf3) { // L: 10283
													var39.method4863(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10285
													if (var10.modelOrthog) { // L: 10286
														var39.method4775(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method4863(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10287
													}
												}
											}

											Tiles.method2221(); // L: 10290
										} else {
											Font var29;
											if (var10.type == 8 && var10 == class130.field1574 && Client.field647 == Client.field646) { // L: 10293 10294
												var19 = 0; // L: 10295
												var20 = 0; // L: 10296
												var29 = DecorativeObject.fontPlain12; // L: 10297
												String var30 = var10.text; // L: 10298

												String var31;
												for (var30 = class121.method2979(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 10300 10301 10313
													var24 = var30.indexOf("<br>"); // L: 10302
													if (var24 != -1) { // L: 10303
														var31 = var30.substring(0, var24); // L: 10304
														var30 = var30.substring(var24 + 4); // L: 10305
													} else {
														var31 = var30; // L: 10308
														var30 = ""; // L: 10309
													}

													var25 = var29.stringWidth(var31); // L: 10311
													if (var25 > var19) { // L: 10312
														var19 = var25;
													}
												}

												var19 += 6; // L: 10315
												var20 += 7; // L: 10316
												var24 = var12 + var10.width - 5 - var19; // L: 10317
												var25 = var13 + var10.height + 5; // L: 10318
												if (var24 < var12 + 5) { // L: 10319
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 10320
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 10321
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10322
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10323
												var30 = var10.text; // L: 10324
												var26 = var25 + var29.ascent + 2; // L: 10325

												for (var30 = class121.method2979(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 10326 10327 10338
													int var27 = var30.indexOf("<br>"); // L: 10328
													if (var27 != -1) { // L: 10329
														var31 = var30.substring(0, var27); // L: 10330
														var30 = var30.substring(var27 + 4); // L: 10331
													} else {
														var31 = var30; // L: 10334
														var30 = ""; // L: 10335
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 10337
												}
											}

											if (var10.type == 9) { // L: 10342
												if (var10.field3603) { // L: 10347
													var19 = var12; // L: 10348
													var20 = var13 + var10.height; // L: 10349
													var21 = var12 + var10.width; // L: 10350
													var22 = var13; // L: 10351
												} else {
													var19 = var12; // L: 10354
													var20 = var13; // L: 10355
													var21 = var12 + var10.width; // L: 10356
													var22 = var13 + var10.height; // L: 10357
												}

												if (var10.lineWid == 1) { // L: 10359
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10360
												} else {
													class36.method716(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10363
												}
											} else if (var10.type == 12) { // L: 10367
												class314 var37 = var10.method6392(); // L: 10368
												class309 var32 = var10.method6394(); // L: 10369
												if (var37 != null && var32 != null && var37.method6143()) { // L: 10370
													var29 = var10.getFont(); // L: 10371
													if (var29 != null) { // L: 10372
														Client.field697.method9643(var12, var13, var10.width, var10.height, var37.method6200(), var37.method6299(), var37.method6141(), var37.method6142(), var37.method6140()); // L: 10373
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 10374
														if (!var37.method6138() && var37.method6135().method7262()) { // L: 10375
															Client.field697.method9648(var32.field3491, var22, var32.field3493, var32.field3489); // L: 10376
															Client.field697.method9645(var37.method6136(), var29); // L: 10377
														} else {
															Client.field697.method9648(var10.color, var22, var32.field3493, var32.field3489); // L: 10380
															Client.field697.method9645(var37.method6135(), var29); // L: 10381
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10383
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 10388
}
