import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("a")
	@Export("name")
	public String name;
	@ObfuscatedName("o")
	@Export("owner")
	public String owner;
	@ObfuscatedName("g")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1093956825
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -724455409
	)
	int field3939;

	@ObfuscatedSignature(
		descriptor = "(Lni;Llc;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field3939 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lla;",
		garbageValue = "-450730044"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lla;",
		garbageValue = "91"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-763520850"
	)
	@Export("readName")
	final void readName(String var1) {
		this.name = class134.method2788(var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1960344003"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		this.owner = class134.method2788(var1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "248840752"
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

				for (long var8 = var2; 0L != var8; var8 /= 37L) {
					++var7;
				}

				StringBuilder var10 = new StringBuilder(var7);

				while (var5 != 0L) {
					long var11 = var5;
					var5 /= 37L;
					var10.append(class320.base37Table[(int)(var11 - var5 * 37L)]);
				}

				var4 = var10.reverse().toString();
			}
		} else {
			var4 = null;
		}

		this.readName(var4);
		this.minKick = var1.readByte();
		var7 = var1.readUnsignedByte();
		if (var7 != 255) {
			this.clear();

			for (int var13 = 0; var13 < var7; ++var13) {
				FriendsChatMember var9 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var14 = var1.readUnsignedShort();
				var9.set(var14, ++this.field3939 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "65280"
	)
	public final void method6040(Buffer var1) {
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

			var6.set(var3, ++this.field3939 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-12509743"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)V",
		garbageValue = "609728257"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
