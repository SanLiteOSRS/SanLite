import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jq")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1336273469
	)
	public static int field3302;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("o")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "79012875"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "44"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "-105"
	)
	static int method5520(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 1258
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1259
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WallObject.Widget_unpackTargetMask(class67.getWidgetFlags(var3)); // L: 1260
			return 1; // L: 1261
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1263
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1270
				if (var3.dataText == null) { // L: 1271
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1272
				}

				return 1; // L: 1273
			} else {
				return 2; // L: 1275
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1264
			--var4; // L: 1265
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1266
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1267
			} else {
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1268
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "743150001"
	)
	static int method5523(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class437 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 4742
			if (var0 != 7501) { // L: 4764
				int var19;
				int var20;
				if (var0 == 7502) { // L: 4773
					TaskHandler.Interpreter_intStackSize -= 3; // L: 4774
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4775
					var19 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 4776
					var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 4777
					var20 = SecureRandomCallable.method2126(var19); // L: 4778
					var7 = class13.method174(var19); // L: 4779
					int var21 = NPC.method2433(var19); // L: 4780
					class438 var26 = GrandExchangeOfferNameComparator.method6002(var3); // L: 4781
					class436 var27 = WorldMapArchiveLoader.method7220(var20); // L: 4782
					int[] var28 = var27.field4678[var7]; // L: 4783
					int var12 = 0; // L: 4784
					int var13 = var28.length; // L: 4785
					if (var21 >= 0) { // L: 4786
						if (var21 >= var13) { // L: 4787
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 4788
						}

						var12 = var21; // L: 4790
						var13 = var21 + 1; // L: 4791
					}

					Object[] var14 = var26.method7645(var7); // L: 4793
					if (var14 == null && var27.field4681 != null) { // L: 4794 4795
						var14 = var27.field4681[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 4797
						for (var15 = var12; var15 < var13; ++var15) { // L: 4798
							var16 = var28[var15]; // L: 4799
							class433 var22 = AbstractWorldMapIcon.method5044(var16); // L: 4800
							if (var22 == class433.field4676) { // L: 4801
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.method6053(var16); // L: 4802
							}
						}

						return 1; // L: 4804
					} else {
						var15 = var14.length / var28.length; // L: 4806
						if (var5 >= 0 && var5 < var15) { // L: 4807
							for (var16 = var12; var16 < var13; ++var16) { // L: 4810
								int var17 = var16 + var28.length * var5; // L: 4811
								class433 var18 = AbstractWorldMapIcon.method5044(var28[var16]); // L: 4812
								if (var18 == class433.field4676) { // L: 4813
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 4814
								}
							}

							return 1; // L: 4816
						} else {
							throw new RuntimeException(); // L: 4808
						}
					}
				} else if (var0 == 7503) { // L: 4818
					TaskHandler.Interpreter_intStackSize -= 2; // L: 4819
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4820
					var19 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 4821
					var5 = 0; // L: 4822
					var20 = SecureRandomCallable.method2126(var19); // L: 4823
					var7 = class13.method174(var19); // L: 4824
					class438 var25 = GrandExchangeOfferNameComparator.method6002(var3); // L: 4825
					class436 var9 = WorldMapArchiveLoader.method7220(var20); // L: 4826
					int[] var10 = var9.field4678[var7]; // L: 4827
					Object[] var11 = var25.method7645(var7); // L: 4828
					if (var11 == null && var9.field4681 != null) { // L: 4829 4830
						var11 = var9.field4681[var7]; // L: 4831
					}

					if (var11 != null) { // L: 4834
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5; // L: 4835
					return 1; // L: 4836
				} else if (var0 != 7504 && var0 != 7509) { // L: 4838
					if (var0 == 7505) { // L: 4855
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4856
						class438 var24 = GrandExchangeOfferNameComparator.method6002(var3); // L: 4857
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var24.field4693; // L: 4858
						return 1; // L: 4859
					} else if (var0 == 7506) { // L: 4861
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4862
						var19 = -1; // L: 4863
						if (class155.field1721 != null && var3 >= 0 && var3 < class155.field1721.size()) { // L: 4864
							var19 = (Integer)class155.field1721.get(var3); // L: 4865
						}

						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var19; // L: 4867
						return 1; // L: 4868
					} else if (var0 != 7507 && var0 != 7510) { // L: 4870
						return 2; // L: 4897
					} else {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4871
						var4 = Tiles.method2116(var3); // L: 4872
						var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4873
						var6 = class433.method7606(var5); // L: 4874
						if (var6 == null) { // L: 4875
							throw new RuntimeException(); // L: 4876
						} else if (SecureRandomCallable.method2126(var5) != Client.field772) { // L: 4878
							throw new RuntimeException(); // L: 4879
						} else if (class155.field1721 == null && class155.field1721.isEmpty()) { // L: 4881
							throw new RuntimeException(); // L: 4882
						} else {
							var7 = NPC.method2433(var5); // L: 4884
							List var8 = var6.method7633(var4, var7); // L: 4885
							class155.field1721 = new LinkedList(class155.field1721); // L: 4886
							if (var8 != null) { // L: 4887
								class155.field1721.retainAll(var8); // L: 4888
							} else {
								class155.field1721.clear(); // L: 4891
							}

							HealthBar.field1255 = class155.field1721.iterator(); // L: 4893
							if (var0 == 7507) { // L: 4894
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class155.field1721.size();
							}

							return 1; // L: 4895
						}
					}
				} else {
					--TaskHandler.Interpreter_intStackSize; // L: 4839
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4840
					class437 var23 = class78.method2156(var3); // L: 4841
					if (var23 == null) { // L: 4842
						throw new RuntimeException(); // L: 4843
					} else {
						class155.field1721 = var23.method7633(0, 0); // L: 4845
						var5 = 0; // L: 4846
						if (class155.field1721 != null) { // L: 4847
							Client.field772 = var3; // L: 4848
							HealthBar.field1255 = class155.field1721.iterator(); // L: 4849
							var5 = class155.field1721.size(); // L: 4850
						}

						if (var0 == 7504) { // L: 4852
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 4853
					}
				}
			} else {
				if (HealthBar.field1255 != null && HealthBar.field1255.hasNext()) { // L: 4765
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (Integer)HealthBar.field1255.next(); // L: 4766
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4769
				}

				return 1; // L: 4771
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4743
			var4 = Tiles.method2116(var3); // L: 4744
			var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4745
			var6 = class433.method7606(var5); // L: 4746
			if (var6 == null) { // L: 4747
				throw new RuntimeException(); // L: 4748
			} else {
				var7 = NPC.method2433(var5); // L: 4750
				class155.field1721 = var6.method7633(var4, var7); // L: 4751
				if (class155.field1721 != null) { // L: 4752
					Client.field772 = SecureRandomCallable.method2126(var5); // L: 4753
					HealthBar.field1255 = class155.field1721.iterator(); // L: 4754
					if (var0 == 7500) { // L: 4755
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class155.field1721.size();
					}
				} else {
					Client.field772 = -1; // L: 4758
					HealthBar.field1255 = null; // L: 4759
					if (var0 == 7500) { // L: 4760
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 4762
			}
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-104855916"
	)
	static void method5522(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 12262
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 12263
				var1.remove(); // L: 12264
			}
		}

	} // L: 12267
}
