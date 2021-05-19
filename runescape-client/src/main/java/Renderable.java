import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -942600749
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("ci")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-2056798771"
	)
	public static byte[] method4079(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? SequenceDefinition.method3087(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldj;",
		garbageValue = "74672048"
	)
	static AttackOption[] method4080() {
		return new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.field1329, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "-1751967768"
	)
	static int method4078(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--class13.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--WorldMapCacheName.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--WorldMapCacheName.Interpreter_intStackSize;
										return 1;
									}
								} else {
									WorldMapCacheName.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--class13.Interpreter_stringStackSize;
								--WorldMapCacheName.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--WorldMapCacheName.Interpreter_intStackSize;
							return 1;
						}
					} else {
						WorldMapCacheName.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					WorldMapCacheName.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				WorldMapCacheName.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			WorldMapCacheName.Interpreter_intStackSize -= 5;
			return 1;
		}
	}
}
