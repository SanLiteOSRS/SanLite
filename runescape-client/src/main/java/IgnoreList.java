import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = -1974595173
	)
	static int field3620;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		signature = "(Lmu;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.loginType = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(B)Ljc;",
		garbageValue = "35"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IB)[Ljc;",
		garbageValue = "-19"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lkf;IB)V",
		garbageValue = "-55"
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
						if (var8 != null && var8 != var7) {
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)[Lij;",
		garbageValue = "1485577751"
	)
	static GameBuild[] method5182() {
		return new GameBuild[]{GameBuild.LIVE, GameBuild.WIP, GameBuild.RC, GameBuild.BUILDLIVE};
	}
}
