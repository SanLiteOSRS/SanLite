import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Lnc;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.loginType = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Llx;",
		garbageValue = "126"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)[Llx;",
		garbageValue = "1924184817"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IS)V",
		garbageValue = "-13688"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) {
				int var3 = var1.readUnsignedByte();
				boolean var4 = (var3 & 1) == 1;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				var1.readStringCp1252NullTerminated();
				if (var5 != null && var5.hasCleanName()) {
					Ignored var7 = (Ignored)this.getByCurrentUsername(var5);
					if (var4) {
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
						if (var8 != null && var7 != var8) {
							if (var7 != null) {
								this.remove(var8);
							} else {
								var7 = var8;
							}
						}
					}

					if (var7 != null) {
						this.changeName(var7, var5, var6);
						continue;
					}

					if (this.getSize() < 400) {
						int var9 = this.getSize();
						var7 = (Ignored)this.addLast(var5, var6);
						var7.id = var9;
					}
					continue;
				}

				throw new IllegalStateException();
			}

			return;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "369567526"
	)
	static int method5628(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return WorldMapDecorationType.method4833(var0, var1, var2);
		} else if (var0 < 1100) {
			return class312.method5616(var0, var1, var2);
		} else if (var0 < 1200) {
			return InvDefinition.method2619(var0, var1, var2);
		} else if (var0 < 1300) {
			return class43.method435(var0, var1, var2);
		} else if (var0 < 1400) {
			return ChatChannel.method2009(var0, var1, var2);
		} else if (var0 < 1500) {
			return class135.method2600(var0, var1, var2);
		} else if (var0 < 1600) {
			return SceneTilePaint.method4258(var0, var1, var2);
		} else if (var0 < 1700) {
			return Timer.method5600(var0, var1, var2);
		} else if (var0 < 1800) {
			return GrandExchangeOfferAgeComparator.method5064(var0, var1, var2);
		} else if (var0 < 1900) {
			return ScriptEvent.method2093(var0, var1, var2);
		} else if (var0 < 2000) {
			return class26.method274(var0, var1, var2);
		} else if (var0 < 2100) {
			return class312.method5616(var0, var1, var2);
		} else if (var0 < 2200) {
			return InvDefinition.method2619(var0, var1, var2);
		} else if (var0 < 2300) {
			return class43.method435(var0, var1, var2);
		} else if (var0 < 2400) {
			return ChatChannel.method2009(var0, var1, var2);
		} else if (var0 < 2500) {
			return class135.method2600(var0, var1, var2);
		} else if (var0 < 2600) {
			return VarpDefinition.method2629(var0, var1, var2);
		} else if (var0 < 2700) {
			return FontName.method6298(var0, var1, var2);
		} else if (var0 < 2800) {
			return class93.method2080(var0, var1, var2);
		} else if (var0 < 2900) {
			return Occluder.method4110(var0, var1, var2);
		} else if (var0 < 3000) {
			return class26.method274(var0, var1, var2);
		} else if (var0 < 3200) {
			return UserComparator9.method2466(var0, var1, var2);
		} else if (var0 < 3300) {
			return ObjectComposition.method2964(var0, var1, var2);
		} else if (var0 < 3400) {
			return WorldMapSection2.method3257(var0, var1, var2);
		} else if (var0 < 3500) {
			return WorldMapLabelSize.method3217(var0, var1, var2);
		} else if (var0 < 3700) {
			return class26.method273(var0, var1, var2);
		} else if (var0 < 3800) {
			return class3.method41(var0, var1, var2);
		} else if (var0 < 3900) {
			return WorldMapLabelSize.method3219(var0, var1, var2);
		} else if (var0 < 4000) {
			return class304.method5528(var0, var1, var2);
		} else if (var0 < 4100) {
			return FriendsList.method5647(var0, var1, var2);
		} else if (var0 < 4200) {
			return class80.method1902(var0, var1, var2);
		} else if (var0 < 4300) {
			return WorldMapLabelSize.method3209(var0, var1, var2);
		} else if (var0 < 5100) {
			return class24.method261(var0, var1, var2);
		} else if (var0 < 5400) {
			return class7.method74(var0, var1, var2);
		} else if (var0 < 5600) {
			return class12.method173(var0, var1, var2);
		} else if (var0 < 5700) {
			return HealthBarDefinition.method2727(var0, var1, var2);
		} else if (var0 < 6300) {
			return UrlRequester.method2420(var0, var1, var2);
		} else if (var0 < 6600) {
			return GraphicsObject.method1892(var0, var1, var2);
		} else if (var0 < 6700) {
			return GameBuild.method4843(var0, var1, var2);
		} else if (var0 < 6800) {
			return class27.method280(var0, var1, var2);
		} else if (var0 < 6900) {
			return class214.method4280(var0, var1, var2);
		} else if (var0 < 7000) {
			return Login.method1937(var0, var1, var2);
		} else if (var0 < 7100) {
			return SceneTilePaint.method4260(var0, var1, var2);
		} else if (var0 < 7200) {
			return class8.method82(var0, var1, var2);
		} else {
			return var0 < 7300 ? KeyHandler.method364(var0, var1, var2) : 2;
		}
	}
}
