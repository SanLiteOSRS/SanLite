import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		signature = "(Lmf;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.loginType = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Llt;",
		garbageValue = "-1522637653"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)[Llt;",
		garbageValue = "1232560537"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;II)V",
		garbageValue = "-696903519"
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
}
