import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lkg;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("l")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	@Export("owner")
	public String owner;
	@ObfuscatedName("b")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1770422849
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 348775717
	)
	int field3671;

	@ObfuscatedSignature(
		signature = "(Lml;Lkg;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field3671 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Ljn;",
		garbageValue = "-315842787"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(II)[Ljn;",
		garbageValue = "1723641195"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1];
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-1893983659"
	)
	@Export("readName")
	final void readName(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = Messages.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("setOwner")
	final void setOwner(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (var5 % 37L == 0L && 0L != var5) {
			var5 /= 37L;
		}

		String var10 = Messages.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.owner = var10;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		signature = "(Lkx;B)V",
		garbageValue = "-9"
	)
	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		long var5 = var2;
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) {
			if (var2 % 37L == 0L) {
				var4 = null;
			} else {
				var7 = 0;

				for (long var13 = var2; var13 != 0L; var13 /= 37L) {
					++var7;
				}

				StringBuilder var15 = new StringBuilder(var7);

				while (0L != var5) {
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
				var9.set(var10, ++this.field3671 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		signature = "(Lkx;I)V",
		garbageValue = "-941337557"
	)
	public final void method5428(Buffer var1) {
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

			var6.set(var3, ++this.field3671 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "17506"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1186051536"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((FriendsChatMember)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		signature = "(Ljb;I)V",
		garbageValue = "1217977801"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
