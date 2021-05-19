import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("o")
public class class2 {
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = 1803015327
	)
	static int field18;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -3980940730251975189L
	)
	long field23;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -161660797
	)
	int field19;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	IterableNodeDeque field22;

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public class2(Buffer var1) {
		this.field19 = -1;
		this.field22 = new IterableNodeDeque();
		this.method22(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "2001634742"
	)
	void method22(Buffer var1) {
		this.field23 = var1.readLong();
		this.field19 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class13(this);
			} else if (var2 == 1) {
				var3 = new class8(this);
			} else if (var2 == 13) {
				var3 = new class26(this);
			} else if (var2 == 4) {
				var3 = new class17(this);
			} else if (var2 == 6) {
				var3 = new class10(this);
			} else if (var2 == 5) {
				var3 = new class22(this);
			} else if (var2 == 2) {
				var3 = new class23(this);
			} else if (var2 == 7) {
				var3 = new class21(this);
			} else if (var2 == 14) {
				var3 = new class18(this);
			} else if (var2 == 8) {
				var3 = new class6(this);
			} else if (var2 == 9) {
				var3 = new class0(this);
			} else if (var2 == 10) {
				var3 = new class4(this);
			} else if (var2 == 11) {
				var3 = new class1(this);
			} else if (var2 == 12) {
				var3 = new class15(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class27(this);
			}

			((class14)var3).vmethod339(var1);
			this.field22.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;B)V",
		garbageValue = "62"
	)
	public void method25(class11 var1) {
		if (var1.field103 == this.field23 && this.field19 == var1.field90) {
			for (class14 var2 = (class14)this.field22.last(); var2 != null; var2 = (class14)this.field22.previous()) {
				var2.vmethod338(var1);
			}

			++var1.field90;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "158273003"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class69.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id);

			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, (Object)null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];

							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var2);
			var1.remove();
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-56"
	)
	public static boolean method28(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public static void method26() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIB)V",
		garbageValue = "23"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			InterfaceParent.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = UserComparator9.Widget_getSpellActionName(var0);
			if (var3 != null) {
				InterfaceParent.insertMenuItemNoShift(var3, HorizontalAlignment.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			InterfaceParent.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			InterfaceParent.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			InterfaceParent.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			InterfaceParent.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var13;
		if (var0.type == 2) {
			var13 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var15 = 0; var15 < var0.width; ++var15) {
					int var16 = (var0.paddingX + 32) * var15;
					int var7 = (var0.paddingY + 32) * var4;
					if (var13 < 20) {
						var16 += var0.inventoryXOffsets[var13];
						var7 += var0.inventoryYOffsets[var13];
					}

					if (var1 >= var16 && var2 >= var7 && var1 < var16 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var13;
						NPCComposition.hoveredItemContainer = var0;
						if (var0.itemIds[var13] > 0) {
							ItemComposition var8 = Strings.ItemDefinition_get(var0.itemIds[var13] - 1);
							if (Client.isItemSelected == 1 && Varcs.method2329(class26.getWidgetFlags(var0))) {
								if (var0.id != class35.selectedItemWidget || var13 != UserComparator8.selectedItemSlot) {
									InterfaceParent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id);
								}
							} else if (Client.isSpellSelected && Varcs.method2329(class26.getWidgetFlags(var0))) {
								if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 16) == 16) {
									InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								if (Client.shiftClickDrop && class13.method213()) {
									var10 = var8.getShiftClickIndex();
								}

								int var11;
								if (Varcs.method2329(class26.getWidgetFlags(var0))) {
									for (var11 = 4; var11 >= 3; --var11) {
										if (var10 != var11) {
											class32.addWidgetItemMenuItem(var0, var8, var13, var11, false);
										}
									}
								}

								if (WorldMapIcon_0.method3509(class26.getWidgetFlags(var0))) {
									InterfaceParent.insertMenuItemNoShift("Use", HorizontalAlignment.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id);
								}

								if (Varcs.method2329(class26.getWidgetFlags(var0))) {
									for (var11 = 2; var11 >= 0; --var11) {
										if (var10 != var11) {
											class32.addWidgetItemMenuItem(var0, var8, var13, var11, false);
										}
									}

									if (var10 >= 0) {
										class32.addWidgetItemMenuItem(var0, var8, var13, var10, true);
									}
								}

								var9 = var0.itemActions;
								if (var9 != null) {
									for (var11 = 4; var11 >= 0; --var11) {
										if (var9[var11] != null) {
											byte var12 = 0;
											if (var11 == 0) {
												var12 = 39;
											}

											if (var11 == 1) {
												var12 = 40;
											}

											if (var11 == 2) {
												var12 = 41;
											}

											if (var11 == 3) {
												var12 = 42;
											}

											if (var11 == 4) {
												var12 = 43;
											}

											InterfaceParent.insertMenuItemNoShift(var9[var11], HorizontalAlignment.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id);
										}
									}
								}

								InterfaceParent.insertMenuItemNoShift("Examine", HorizontalAlignment.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id);
							}
						}
					}

					++var13;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				var4 = class26.getWidgetFlags(var0);
				boolean var17 = (var4 >> 21 & 1) != 0;
				if (var17 && (GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 32) == 32) {
					InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) {
					String var14;
					if (!class125.method2507(class26.getWidgetFlags(var0), var13) && var0.onOp == null) {
						var14 = null;
					} else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && var0.actions[var13].trim().length() != 0) {
						var14 = var0.actions[var13];
					} else {
						var14 = null;
					}

					if (var14 != null) {
						InterfaceParent.insertMenuItemNoShift(var14, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = UserComparator9.Widget_getSpellActionName(var0);
				if (var3 != null) {
					InterfaceParent.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var5;
					if (!class125.method2507(class26.getWidgetFlags(var0), var4) && var0.onOp == null) {
						var5 = null;
					} else if (var0.actions != null && var0.actions.length > var4 && var0.actions[var4] != null && var0.actions[var4].trim().length() != 0) {
						var5 = var0.actions[var4];
					} else {
						var5 = null;
					}

					if (var5 != null) {
						class311.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				if (PacketWriter.method2410(class26.getWidgetFlags(var0))) {
					InterfaceParent.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
