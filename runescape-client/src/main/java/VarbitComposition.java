import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("VarbitDefinition_archive")
	static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("q")
	static final int[] field1989;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1045443253
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -683508103
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 705581509
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field1989 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field1989[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	VarbitComposition() {
	} // L: 25

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-953339908"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 43
			if (var2 == 0) { // L: 44
				return; // L: 47
			}

			this.decodeNext(var1, var2); // L: 45
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-2147483648"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 50
			this.baseVar = var1.readUnsignedShort(); // L: 51
			this.startBit = var1.readUnsignedByte(); // L: 52
			this.endBit = var1.readUnsignedByte(); // L: 53
		}

	} // L: 56

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-74"
	)
	public static boolean method3501(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false; // L: 241 242
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1895304054"
	)
	static int method3502(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class437 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 4751
			if (var0 != 7501) { // L: 4773
				int var19;
				int var20;
				if (var0 == 7502) { // L: 4782
					Nameable.Interpreter_intStackSize -= 3; // L: 4783
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4784
					var19 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 4785
					var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 4786
					var20 = class145.method3023(var19); // L: 4787
					var7 = ClanSettings.method2909(var19); // L: 4788
					int var21 = class290.method5488(var19); // L: 4789
					class438 var26 = class101.method2516(var3); // L: 4790
					class436 var27 = Archive.method5751(var20); // L: 4791
					int[] var28 = var27.field4668[var7]; // L: 4792
					int var12 = 0; // L: 4793
					int var13 = var28.length; // L: 4794
					if (var21 >= 0) { // L: 4795
						if (var21 >= var13) { // L: 4796
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 4797
						}

						var12 = var21; // L: 4799
						var13 = var21 + 1; // L: 4800
					}

					Object[] var14 = var26.method7548(var7); // L: 4802
					if (var14 == null && var27.field4671 != null) { // L: 4803 4804
						var14 = var27.field4671[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 4806
						for (var15 = var12; var15 < var13; ++var15) { // L: 4807
							var16 = var28[var15]; // L: 4808
							class433 var22 = class19.method285(var16); // L: 4809
							if (var22 == class433.field4655) { // L: 4810
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class352.method6435(var16); // L: 4811
							}
						}

						return 1; // L: 4813
					} else {
						var15 = var14.length / var28.length; // L: 4815
						if (var5 >= 0 && var5 < var15) { // L: 4816
							for (var16 = var12; var16 < var13; ++var16) { // L: 4819
								int var17 = var16 + var28.length * var5; // L: 4820
								class433 var18 = class19.method285(var28[var16]); // L: 4821
								if (var18 == class433.field4655) { // L: 4822
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 4823
								}
							}

							return 1; // L: 4825
						} else {
							throw new RuntimeException(); // L: 4817
						}
					}
				} else if (var0 == 7503) { // L: 4827
					Nameable.Interpreter_intStackSize -= 2; // L: 4828
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4829
					var19 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 4830
					var5 = 0; // L: 4831
					var20 = class145.method3023(var19); // L: 4832
					var7 = ClanSettings.method2909(var19); // L: 4833
					class438 var25 = class101.method2516(var3); // L: 4834
					class436 var9 = Archive.method5751(var20); // L: 4835
					int[] var10 = var9.field4668[var7]; // L: 4836
					Object[] var11 = var25.method7548(var7); // L: 4837
					if (var11 == null && var9.field4671 != null) { // L: 4838 4839
						var11 = var9.field4671[var7]; // L: 4840
					}

					if (var11 != null) { // L: 4843
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5; // L: 4844
					return 1; // L: 4845
				} else if (var0 != 7504 && var0 != 7509) { // L: 4847
					if (var0 == 7505) { // L: 4864
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4865
						class438 var24 = class101.method2516(var3); // L: 4866
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var24.field4677; // L: 4867
						return 1; // L: 4868
					} else if (var0 == 7506) { // L: 4870
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4871
						var19 = -1; // L: 4872
						if (class93.field1281 != null && var3 >= 0 && var3 < class93.field1281.size()) { // L: 4873
							var19 = (Integer)class93.field1281.get(var3); // L: 4874
						}

						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var19; // L: 4876
						return 1; // L: 4877
					} else if (var0 != 7507 && var0 != 7510) { // L: 4879
						return 2; // L: 4906
					} else {
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4880
						var4 = BuddyRankComparator.method2610(var3); // L: 4881
						var5 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4882
						var6 = Message.method1060(var5); // L: 4883
						if (var6 == null) { // L: 4884
							throw new RuntimeException(); // L: 4885
						} else if (class145.method3023(var5) != Client.field764) { // L: 4887
							throw new RuntimeException(); // L: 4888
						} else if (class93.field1281 == null && class93.field1281.isEmpty()) { // L: 4890
							throw new RuntimeException(); // L: 4891
						} else {
							var7 = class290.method5488(var5); // L: 4893
							List var8 = var6.method7537(var4, var7); // L: 4894
							class93.field1281 = new LinkedList(class93.field1281); // L: 4895
							if (var8 != null) { // L: 4896
								class93.field1281.retainAll(var8); // L: 4897
							} else {
								class93.field1281.clear(); // L: 4900
							}

							Skills.field3547 = class93.field1281.iterator(); // L: 4902
							if (var0 == 7507) { // L: 4903
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class93.field1281.size();
							}

							return 1; // L: 4904
						}
					}
				} else {
					--Nameable.Interpreter_intStackSize; // L: 4848
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4849
					class437 var23 = class115.method2650(var3); // L: 4850
					if (var23 == null) { // L: 4851
						throw new RuntimeException(); // L: 4852
					} else {
						class93.field1281 = var23.method7537(0, 0); // L: 4854
						var5 = 0; // L: 4855
						if (class93.field1281 != null) { // L: 4856
							Client.field764 = var3; // L: 4857
							Skills.field3547 = class93.field1281.iterator(); // L: 4858
							var5 = class93.field1281.size(); // L: 4859
						}

						if (var0 == 7504) { // L: 4861
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 4862
					}
				}
			} else {
				if (Skills.field3547 != null && Skills.field3547.hasNext()) { // L: 4774
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = (Integer)Skills.field3547.next(); // L: 4775
				} else {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4778
				}

				return 1; // L: 4780
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4752
			var4 = BuddyRankComparator.method2610(var3); // L: 4753
			var5 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4754
			var6 = Message.method1060(var5); // L: 4755
			if (var6 == null) { // L: 4756
				throw new RuntimeException(); // L: 4757
			} else {
				var7 = class290.method5488(var5); // L: 4759
				class93.field1281 = var6.method7537(var4, var7); // L: 4760
				if (class93.field1281 != null) { // L: 4761
					Client.field764 = class145.method3023(var5); // L: 4762
					Skills.field3547 = class93.field1281.iterator(); // L: 4763
					if (var0 == 7500) { // L: 4764
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class93.field1281.size();
					}
				} else {
					Client.field764 = -1; // L: 4767
					Skills.field3547 = null; // L: 4768
					if (var0 == 7500) { // L: 4769
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 4771
			}
		}
	}
}
