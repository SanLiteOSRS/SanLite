import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ic")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("o")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("go")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("v")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("n")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("f")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1525645945
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 3754683323986881495L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 488997904210519011L
	)
	long field2933;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Led;"
	)
	class135[] field2937;
	@ObfuscatedName("b")
	boolean field2928;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		Widget_cachedModels = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		this.field2928 = false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([I[Led;Z[IZIB)V",
		garbageValue = "-36"
	)
	public void method4704(int[] var1, class135[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field2937 = var2;
		this.field2928 = var3;
		this.update(var1, var4, var5, var6);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "1389287024"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < ModelData0.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = WorldMapIcon_1.KitDefinition_get(var6);
					if (var7 != null && !var7.nonSelectable && var7.bodypartID == var5 + (var3 ? 7 : 0)) {
						var1[equipmentIndices[var5]] = var6 + 256;
						break;
					}
				}
			}
		}

		this.equipment = var1;
		this.bodyColors = var2;
		this.isFemale = var3;
		this.npcTransformId = var4;
		this.setHash();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "365347894"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) {
			int var3 = this.equipment[equipmentIndices[var1]];
			if (var3 != 0) {
				var3 -= 256;

				KitDefinition var4;
				do {
					if (!var2) {
						--var3;
						if (var3 < 0) {
							var3 = ModelData0.KitDefinition_fileCount - 1;
						}
					} else {
						++var3;
						if (var3 >= ModelData0.KitDefinition_fileCount) {
							var3 = 0;
						}
					}

					var4 = WorldMapIcon_1.KitDefinition_get(var3);
				} while(var4 == null || var4.nonSelectable || (this.isFemale ? 7 : 0) + var1 != var4.bodypartID);

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-410673716"
	)
	public void method4703(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class15.field137[var1].length - 1;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		} else {
			do {
				++var3;
				if (var3 >= class15.field137[var1].length) {
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "862010308"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update((int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "580596518"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[equipmentIndices[var2]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1440101066"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		int var3 = this.equipment[5];
		int var4 = this.equipment[9];
		this.equipment[5] = var4;
		this.equipment[9] = var3;
		this.hash = 0L;

		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			this.hash <<= 4;
			if (this.equipment[var5] >= 256) {
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) {
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) {
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) {
			this.hash <<= 3;
			this.hash += (long)this.bodyColors[var5];
		}

		this.hash <<= 1;
		this.hash += (long)(this.isFemale ? 1 : 0);
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (0L != var1 && this.hash != var1 || this.field2928) {
			Widget_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lfl;ILfl;II)Lgr;",
		garbageValue = "1850715119"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return StructComposition.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];

				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) {
					var5 += (long)(var1.shield - this.equipment[5] << 40);
					var7[5] = var1.shield;
				}

				if (var1.weapon >= 0) {
					var5 += (long)(var1.weapon - this.equipment[3] << 48);
					var7[3] = var1.weapon;
				}
			}

			Model var18 = (Model)Widget_cachedModels.get(var5);
			if (var18 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512 && !WorldMapIcon_1.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !class260.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
						var9 = true;
					}
				}

				if (var9) {
					if (-1L != this.field2933) {
						var18 = (Model)Widget_cachedModels.get(this.field2933);
					}

					if (var18 == null) {
						return null;
					}
				}

				if (var18 == null) {
					ModelData[] var19 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						if (var13 >= 256 && var13 < 512) {
							ModelData var14 = WorldMapIcon_1.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = class260.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3018(this.isFemale);
							if (var15 != null) {
								if (this.field2937 != null) {
									class135 var16 = this.field2937[var12];
									if (var16 != null) {
										int var17;
										if (var16.field1537 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1537.length) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.field1537[var17]);
											}
										}

										if (var16.field1538 != null && var22.retextureFrom != null && var16.field1538.length == var22.retextureTo.length) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.field1538[var17]);
											}
										}
									}
								}

								var19[var11++] = var15;
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class15.field137[var13].length) {
							var20.recolor(class29.field233[var13], class15.field137[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < VarbitComposition.field1708[var13].length) {
							var20.recolor(UserComparator5.field1442[var13], VarbitComposition.field1708[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					Widget_cachedModels.put(var18, var5);
					this.field2933 = var5;
				}
			}

			if (var1 == null && var3 == null) {
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) {
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) {
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4);
				}

				return var21;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Lgm;",
		garbageValue = "-45031641"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return StructComposition.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !WorldMapIcon_1.KitDefinition_get(var3 - 256).method2684()) {
					var1 = true;
				}

				if (var3 >= 512 && !class260.ItemDefinition_get(var3 - 512).method3019(this.isFemale)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var7 = new ModelData[12];
				var3 = 0;

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var6;
					if (var5 >= 256 && var5 < 512) {
						var6 = WorldMapIcon_1.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = class260.ItemDefinition_get(var5 - 512).method3020(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class15.field137[var5].length) {
						var8.recolor(class29.field233[var5], class15.field137[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < VarbitComposition.field1708[var5].length) {
						var8.recolor(UserComparator5.field1442[var5], VarbitComposition.field1708[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1167283796"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + StructComposition.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[Lha;",
		garbageValue = "-90"
	)
	public static class225[] method4705() {
		return new class225[]{class225.field2686, class225.field2680, class225.field2682, class225.field2683, class225.field2681, class225.field2685, class225.field2687, class225.field2684, class225.field2688, class225.field2689};
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-1490609257"
	)
	static SecureRandom method4711() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)V",
		garbageValue = "14"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = UserComparator6.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = UserComparator6.loadClassFromDescriptor(var20);
						if (UserComparator6.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = UserComparator6.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var17.length == var21.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var17[var19] != var21[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (UserComparator6.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(UserComparator6.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class69.reflectionChecks.addFirst(var2);
	}
}
