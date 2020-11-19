import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lka;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("t")
	@Export("name")
	public String name;
	@ObfuscatedName("e")
	@Export("owner")
	public String owner;
	@ObfuscatedName("o")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1444461207
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1905995869
	)
	int field3662;

	@ObfuscatedSignature(
		signature = "(Lmc;Lka;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field3662 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Ljh;",
		garbageValue = "-1664145399"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)[Ljh;",
		garbageValue = "-35"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-2147338724"
	)
	@Export("readName")
	final void readName(String var1) {
		this.name = Login.method2219(var1);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1637949193"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		this.owner = Login.method2219(var1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lkb;S)V",
		garbageValue = "-26042"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		long var5 = var2;
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) {
			if (0L == var2 % 37L) {
				var4 = null;
			} else {
				var7 = 0;

				for (long var13 = var2; 0L != var13; var13 /= 37L) {
					++var7;
				}

				StringBuilder var15 = new StringBuilder(var7);

				while (var5 != 0L) {
					long var11 = var5;
					var5 /= 37L;
					var15.append(class299.base37Table[(int)(var11 - var5 * 37L)]);
				}

				var4 = var15.reverse().toString();
			}
		} else {
			var4 = null;
		}

		this.readName(var4);
		this.minKick = var1.readByte();
		var7 = var1.readUnsignedByte();
		if (var7 != 255) {
			this.clear();

			for (int var8 = 0; var8 < var7; ++var8) {
				FriendsChatMember var9 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var10 = var1.readUnsignedShort();
				var9.set(var10, ++this.field3662 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lkb;S)V",
		garbageValue = "179"
	)
	public final void method5371(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field3662 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1379027801"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-958910490"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).method5161();
		}

	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		signature = "(Ljf;I)V",
		garbageValue = "1754058775"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		signature = "(IIIIIIIII)V",
		garbageValue = "-1171740375"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ScriptFrame.loadInterface(var0)) {
			ItemContainer.field572 = null;
			WorldMapRegion.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (ItemContainer.field572 != null) {
				WorldMapRegion.drawInterface(ItemContainer.field572, -1412584499, var1, var2, var3, var4, WorldMapSprite.field256, GrandExchangeOffer.field87, var7);
				ItemContainer.field572 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field834[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field834[var8] = true;
				}
			}

		}
	}
}
