source ~/.profile.khan

alias ll="ls -l"
alias la="ls -a"

alias edit="bbedit"

alias undocommit="git reset --soft HEAD~1"


HISTFILESIZE=100000

export ANDROID_HOME=$HOME/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/tools/bin
export PATH=$PATH:$ANDROID_HOME/platform-tools

export PATH=$PATH:/usr/local/sbin

export NVM_DIR="$HOME/.nvm"
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"  # This loads nvm
[ -s "$NVM_DIR/bash_completion" ] && \. "$NVM_DIR/bash_completion"  # This loads nvm bash_completion


export PATH="$HOME/.fastlane/bin:$PATH"
export PATH="$HOME/.bin:$PATH"
